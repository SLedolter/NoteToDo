package at.sledolter.note_todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import at.sledolter.note_todo.adapter.BaseNoteAdapter
import at.sledolter.note_todo.models.BaseNote
import java.text.FieldPosition
import java.time.LocalDateTime

class MainActivity : AppCompatActivity() {
    lateinit var testNotes: List<BaseNote>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val note1 = BaseNote()
        note1.title = "Erste Notiz"
        note1.creation_date = LocalDateTime.now()
        note1.content = "Der Inhalt braucht noch keinen Sinn!"

        val note2 = BaseNote()
        note2.title = "Zweite Notiz"
        note2.creation_date = LocalDateTime.now()
        note2.content = "Der Inhalt braucht immer noch keinen Sinn!"

        testNotes = listOf(note1, note2)

        val recyclerView = findViewById<RecyclerView>(R.id.main_recyclerview)
        recyclerView.adapter = BaseNoteAdapter(this, testNotes,
            { position -> onNoteItemClick(position) },
            { position -> onNoteItemLongClick(position) }
        )
        recyclerView.setHasFixedSize(true)

    }

    private fun onNoteItemClick(position: Int) {
        Toast.makeText(this, "Short: " + testNotes[position].title, Toast.LENGTH_SHORT).show()
    }

    private fun onNoteItemLongClick(position: Int) {
        Toast.makeText(this, "Long: " + testNotes[position].title, Toast.LENGTH_SHORT).show()
    }
}
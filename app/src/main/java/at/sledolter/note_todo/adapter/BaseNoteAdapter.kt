package at.sledolter.note_todo.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import at.sledolter.note_todo.R
import at.sledolter.note_todo.models.BaseNote

class BaseNoteAdapter(private val context: Context, private val notesList: List<BaseNote>) :
    RecyclerView.Adapter<BaseNoteAdapter.BaseNoteHolder>() {
    class BaseNoteHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val note_title: TextView = view.findViewById(R.id.txt_note_title)
        val note_creation_date: TextView = view.findViewById(R.id.txt_note_title)
        val note_content: TextView = view.findViewById(R.id.txt_note_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseNoteHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: BaseNoteHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}
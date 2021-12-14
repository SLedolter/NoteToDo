package at.sledolter.note_todo.adapter

import android.content.Context
import android.view.LayoutInflater
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
        val note_creation_date: TextView = view.findViewById(R.id.txt_note_creation_date)
        val note_content: TextView = view.findViewById(R.id.txt_note_content)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseNoteHolder {
        val baseNoteLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.note_default_base, parent, false)

        return BaseNoteHolder(baseNoteLayout)
    }

    override fun onBindViewHolder(holder: BaseNoteHolder, position: Int) {
        val note = notesList[position]
        holder.note_title.text = note.title
        holder.note_creation_date.text = note.creation_date.toString()
        holder.note_content.text = note.content
    }

    override fun getItemCount(): Int = notesList.size
}
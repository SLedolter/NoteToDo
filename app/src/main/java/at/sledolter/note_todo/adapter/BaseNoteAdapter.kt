package at.sledolter.note_todo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import at.sledolter.note_todo.R
import at.sledolter.note_todo.models.BaseNote
import java.time.format.DateTimeFormatter

class BaseNoteAdapter(
    private val context: Context,
    private val notesList: List<BaseNote>,
    private val onNoteItemClicked: (position: Int) -> Unit,
    private val onNoteItemLongClicked: (position: Int) -> Unit
) :
    RecyclerView.Adapter<BaseNoteAdapter.BaseNoteHolder>() {
    class BaseNoteHolder(
        private val view: View,
        private val onNoteItemClicked: (position: Int) -> Unit,
        private val onNoteItemLongClicked: (position: Int) -> Unit
    ) : RecyclerView.ViewHolder(view), View.OnClickListener, View.OnLongClickListener {
        val note_title: TextView = view.findViewById(R.id.txt_note_title)
        val note_creation_date: TextView = view.findViewById(R.id.txt_note_creation_date)
        val note_content: TextView = view.findViewById(R.id.txt_note_content)

        init {
            view.setOnClickListener(this)
            view.setOnLongClickListener(this)
        }

        override fun onClick(view: View) {
            val position = adapterPosition
            onNoteItemClicked(position)
        }

        override fun onLongClick(p0: View?): Boolean {
            val position = adapterPosition
            onNoteItemLongClicked(position)
            return true
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseNoteHolder {
        val baseNoteLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.note_default_base, parent, false)

        return BaseNoteHolder(baseNoteLayout, onNoteItemClicked, onNoteItemLongClicked)
    }

    override fun onBindViewHolder(holder: BaseNoteHolder, position: Int) {
        val note = notesList[position]
        holder.note_title.text = note.title
        // ToDo: split date and time for displaying (only)
        holder.note_creation_date.text = note.creation_date.format(
            DateTimeFormatter.ofPattern("dd.mm.yyyy, hh:mm:ss")
        ).toString()
        holder.note_content.text = note.content
    }

    override fun getItemCount(): Int = notesList.size
}
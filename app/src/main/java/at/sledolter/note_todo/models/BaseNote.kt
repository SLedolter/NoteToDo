package at.sledolter.note_todo.models

import at.sledolter.note_todo.R
import java.time.LocalDate

class BaseNote {
    var title: String = R.string.note_default_title.toString()
    var creation_date: LocalDate
        get() = LocalDate.now()
        set(value) = TODO()
    var content: String = R.string.note_default_content.toString()
}
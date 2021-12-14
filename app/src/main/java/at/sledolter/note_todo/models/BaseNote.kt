package at.sledolter.note_todo.models

import at.sledolter.note_todo.R
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class BaseNote {
    var title: String = R.string.note_default_title.toString()
    var creation_date: LocalDateTime =  LocalDateTime.now()
    var content: String = R.string.note_default_content.toString()
}
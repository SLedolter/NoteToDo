package at.sledolter.note_todo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Kotlin App"
        val main_layout:LinearLayout = findViewById(R.id.main_layout)
        val editText:EditText = EditText(this)
        editText.setText("I am dynamically added!")
        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT)
        editText.setBackgroundColor(Color.GRAY)
        editText.layoutParams = params
        editText.textSize = 24F
        editText.setTextColor(Color.RED)
        main_layout.addView(editText)
    }
}
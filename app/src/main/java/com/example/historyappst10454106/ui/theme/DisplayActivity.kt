package com.example.historyappst10454106.ui.theme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.historyappst10454106.R

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val age = intent.getIntExtra("age", 0)
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = findMatchedFigures(age).joinToString(", ")
    }

    private fun findMatchedFigures(age: Int): List<String> {
        val figures = mapOf(
            "Leonardo da Vinci" to 67,
            "William Shakespeare" to 52,
            "Albert Einstein" to 76,
            "Isaac Newton" to 84,
            "Mahatma Gandhi" to 78,
            "Napoleon Bonaparte" to 51,
            "Cleopatra" to 39,
            "Julius Caesar" to 56,
            "Alexander the Great" to 32,
            "Wolfgang Amadeus Mozart" to 35,
            "Martin Luther King Jr." to 39,
            "Queen Victoria" to 81,
            "Galileo Galilei" to 77,
            "Nelson Mandela" to 95,
            "George Washington" to 67,
            "Christopher Columbus" to 54,
            "Vincent van Gogh" to 37,
            "Elizabeth I of England" to 69,
            "Socrates" to 70
        )
        return figures.filterValues { it == age }.keys.toList()

    }
}
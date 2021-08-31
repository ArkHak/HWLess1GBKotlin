package com.example.hwless1gbkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonReaction()
    }

    private fun buttonReaction() {
        val person = Person("Oleg", "Mysin")
        val buttonExA = findViewById<Button>(R.id.buttonA)
        val textView = findViewById<TextView>(R.id.text_view_person)

        buttonExA.setOnClickListener() {
            textView.text = stringTextView(person)
        }
    }


}
package com.example.hwless1gbkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    companion object {
        private const val TAG_HW_EX_C = "HW_EX_C"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonReaction()

        exC()
    }

    private fun buttonReaction() {
        val person = Person("Oleg", "Mysin")
        val buttonExA = findViewById<Button>(R.id.buttonA)
        val textView = findViewById<TextView>(R.id.text_view_person)

        val textViewCopy = findViewById<TextView>(R.id.text_view_person_copy)
        val buttonExB = findViewById<Button>(R.id.buttonB)

        buttonExA.setOnClickListener() {
            textView.text = stringTextView(person)
        }

        buttonExB.setOnClickListener() {
            val personCopy = person.copy()
            textViewCopy.text = stringTextView(personCopy)
        }

    }

    private fun exC() {
        Log.d(TAG_HW_EX_C, "Cycle for (i in 1..25) ")
        for (i in 1..25) {
            Log.d(TAG_HW_EX_C, i.toString())
        }

        Log.d(TAG_HW_EX_C, "Cycle for (1 until 25) ")
        for (i in 1 until 10) {
            Log.d(TAG_HW_EX_C, i.toString())
        }

        Log.d(TAG_HW_EX_C, "Cycle for (i in 25 downTo 1 step 5) ")
        for (i in 10 downTo 1 step 5) {
            Log.d(TAG_HW_EX_C, i.toString())
        }

        Log.d(TAG_HW_EX_C, "List, size=10 => .forEach { } ")
        val testArray = List(10) { it }
        testArray.forEach { Log.d(TAG_HW_EX_C, it.toString()) }
    }
}

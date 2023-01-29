package com.example.lifespancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
<<<<<<< HEAD
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.lang.*;
=======
>>>>>>> origin

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
<<<<<<< HEAD

        val btnClickMe = findViewById<Button>(R.id.someButton)
        val textView = findViewById<TextView>(R.id.someTextView)
        var clickCounter: Short = 0
        textView.text = "0"
        btnClickMe.setOnClickListener {
            clickCounter = (Math.pow((clickCounter + 1).toDouble(), 1.4)).toInt().toShort()
            textView.text = clickCounter.toString()
            Toast.makeText(this, "hey, you clicked the button",
                Toast.LENGTH_LONG).show()
        }
=======
>>>>>>> origin
    }
}
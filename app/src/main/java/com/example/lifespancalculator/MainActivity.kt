package com.example.lifespancalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.someButton)
        val textView = findViewById<TextView>(R.id.someTextView)
        btnClickMe.setOnClickListener {
            btnClickMe.text = "LOL you clicked me"
            textView.text = "this text view is changed by that goofy ass button"
        }
    }
}
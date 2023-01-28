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
        var clickCounter: Int = 0
        textView.text = "0"
        btnClickMe.setOnClickListener {
            clickCounter += 1
            textView.text = clickCounter.toString()
        }
    }
}
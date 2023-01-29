package com.example.lifespancalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.lang.*;
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.someButton)
        val textView = findViewById<TextView>(R.id.someTextView)
        var clickCounter: Byte = 0
        textView.text = "0"
        btnClickMe.setOnClickListener {
            clickCounter = clickCounter.inc()
            textView.text = clickCounter.toString()
            Toast.makeText(this, "hey, you clicked the button",
                Toast.LENGTH_LONG).show()
        }
    }
}
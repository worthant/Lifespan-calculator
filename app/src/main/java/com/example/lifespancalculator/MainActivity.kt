package com.example.lifespancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSelect : Button = findViewById(R.id.btnSelectDate)
        var dateSelected : TextView = findViewById(R.id.selectedDate)
        var ageCounted : TextView = findViewById(R.id.ageCounted)
  
        
//        var clickCounter: Byte = 0
//        textView.text = "0"
//        btnClickMe.setOnClickListener {
//            clickCounter = clickCounter.inc()
//            textView.text = clickCounter.toString()
//            Toast.makeText(
//                this, "hey, you clicked the button",
//                Toast.LENGTH_LONG
//            ).show()
//        }
    }
}
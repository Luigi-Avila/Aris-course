package com.example.ariscourse.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.ariscourse.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val name = intent.extras?.getString("EXTRA_NAME").orEmpty()
        val tvHello = findViewById<TextView>(R.id.tvHello)
        tvHello.text = "Hola ${name}"
    }
}
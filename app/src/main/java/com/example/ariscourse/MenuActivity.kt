package com.example.ariscourse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.ariscourse.firstapp.MainActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        btnSaludApp.setOnClickListener {
            navigateToSaludApp()
        }
    }

    fun navigateToSaludApp(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
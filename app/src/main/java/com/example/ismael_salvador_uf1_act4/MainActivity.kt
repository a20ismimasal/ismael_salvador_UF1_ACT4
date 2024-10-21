package com.example.ismael_salvador_uf1_act4

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonLogcat = findViewById<Button>(R.id.buttonLogcat)
        val buttonToast = findViewById<Button>(R.id.buttonToast)

        buttonLogcat.setOnClickListener {
            Log.d("MainActivity", "boto apretat")
        }

        buttonToast.setOnClickListener {
            Toast.makeText(this, "boto apretat", Toast.LENGTH_SHORT).show()
        }
    }
}
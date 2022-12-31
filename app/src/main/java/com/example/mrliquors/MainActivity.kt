package com.example.mrliquors

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.mrliqours.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMain : Button = findViewById(R.id.main_menu)

        btnMain.setOnClickListener {
            val intent = Intent(this,Activity2::class.java)
            startActivity(intent)
        }



    }
}
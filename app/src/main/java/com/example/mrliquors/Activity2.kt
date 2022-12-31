package com.example.mrliquors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mrliqours.R

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val btn1 : Button = findViewById(R.id.tall_boys)

        btn1.setOnClickListener {
            val intent = Intent(this,TallBoys::class.java)
            startActivity(intent)
        }
    }
}
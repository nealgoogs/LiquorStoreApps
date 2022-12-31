package com.example.mrliquors

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mrliqours.R


class TallBoysNumbers : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tall_boys_numbers)
        val key = intent.getStringExtra("KEY")

        if( key == null ) {
            finish()
        }

        val prefs = getSharedPreferences("MY_PREFS", Context.MODE_PRIVATE)
        val textView = findViewById<TextView>(R.id.numbers)
        val confirmBtn = findViewById<Button>(R.id.confirm_button)

        val current = prefs.getInt(key, 0)




        textView.setText(current.toString())





        val plusBtn: Button = findViewById(R.id.plus)

        val negBtn: Button = findViewById(R.id.negative)




        plusBtn.setOnClickListener {

                // Get the current value displayed in the TextView
                val currentValueString = textView.text.toString()

                // Convert the string to an integer
                var currentValue = currentValueString.toInt()

                // Increment the value by 1
                currentValue++

                // Set the new value as the text for the TextView
                textView.text = currentValue.toString()



        }

        negBtn.setOnClickListener {

            // Get the current value displayed in the TextView
            val currentValueString = textView.text.toString()

            // Convert the string to an integer
            var currentValue = currentValueString.toInt()

            // Increment the value by 1
            currentValue--

            // Set the new value as the text for the TextView
            textView.text = currentValue.toString()



        }






            confirmBtn.setOnClickListener {
                val num = textView.text.toString()
                val numI = num.toIntOrNull() ?: 0
                prefs.edit().putInt(key, numI).apply()
                finish()
                }

            }
        }


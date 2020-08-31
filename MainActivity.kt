package com.example.wan_cat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textMessage = findViewById<TextView>(R.id. text_message)

        var buttonCat = findViewById<Button>(R.id.button_cat)
        var buttonDog = findViewById<Button>(R.id.button_dog)

        buttonCat.setOnClickListener{
            textMessage.setText(R.string.text_message_cat)
        }

        buttonDog.setOnClickListener{
            textMessage.setText(R.string.text_message_dog)
        }
    }
}
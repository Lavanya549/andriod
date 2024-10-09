package com.example.kotlinsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views by their IDs
        val showButton = findViewById<Button>(R.id.showInput)
        val editText = findViewById<EditText>(R.id.editText)

        // Set a click listener on the button
        showButton.setOnClickListener {
            // Display the text entered in the EditText as a Toast message
            Toast.makeText(this, editText.text, Toast.LENGTH_SHORT).show()
        }
    }
}

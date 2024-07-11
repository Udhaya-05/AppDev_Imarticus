package com.example.activity4

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity4)

        val buttonSignup = null
        buttonSignup.setOnClickListener {
            // Retrieve user input
            val name = editTextName.text.toString()
            val email = editTextEmail.text.toString()

            // Pass data to another activity
            val intent = Intent(this, Activity1::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("EMAIL", email)
            startActivity(intent)
        }
    }
}
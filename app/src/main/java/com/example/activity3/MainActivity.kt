package com.example.activity3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


private var myLocale: Locale? = null
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val greet = findViewById<TextView>(R.id.textView3)
    }



    fun switchTamil(view: View) {
        val myLocale = Locale("ta")
        saveLo
        val greet = findViewById<TextView>(R.id.textView3)
        greet.text = getString(R.string.greetingTamil)


    }
    fun switchEnglish(view: View) {}

}
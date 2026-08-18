package com.malaika.loam

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class sign_in : AppCompatActivity() {
    lateinit var sinin_btn:Button
    lateinit var txt_signup: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_in)
        sinin_btn=findViewById<Button>(R.id.appCompatButton2)
        txt_signup=findViewById<TextView>(R.id.signup)
        sinin_btn.setOnClickListener {
            val intent= Intent(this, navigationActivity2::class.java)
            startActivity(intent)
        }
        txt_signup.setOnClickListener {
            val intent= Intent(this, sign_in::class.java)
            startActivity(intent)
        }

    }
}
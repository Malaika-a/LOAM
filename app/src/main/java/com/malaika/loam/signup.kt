package com.malaika.loam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var btn: Button
        lateinit var btn2: TextView
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)
       btn=findViewById<Button>(R.id.appCompatButton)
        btn2=findViewById<TextView>(R.id.sign__in)
        btn.setOnClickListener {
            val intent=Intent(this, navigationActivity2::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            val intent= Intent(this, sign_in::class.java)
            startActivity(intent)
        }
        }
    }

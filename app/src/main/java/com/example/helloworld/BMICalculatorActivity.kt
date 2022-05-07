package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BMICalculatorActivity : AppCompatActivity() {
    lateinit var btnsendy: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmicalculator)
        btnsendy = findViewById(R.id.btnsendy)
        btnsendy.setOnClickListener {
            var intent = Intent(this,SendmoneyActivity::class.java)
            startActivity(intent)
        }
    }
}
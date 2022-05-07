package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SendmoneyActivity : AppCompatActivity() {
    lateinit var btncancel: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sendmoney)
        btncancel = findViewById(R.id.btncancel)
        btncancel.setOnClickListener {
            var intent = Intent(this,BMICalculatorActivity::class.java)
            startActivity(intent)
        }
    }
}
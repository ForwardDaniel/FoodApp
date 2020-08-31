package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        registerButton.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent);
        }
        openLoginAccount.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent);
        }
    }
}
package com.example.challenge

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_welcome_screen.*

class WelcomeScreenActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)

        btnStart.setOnClickListener{
            Intent(this, LoginActivity::class.java).also{
                intent-> startActivity(intent);
            }
        }
    }
}
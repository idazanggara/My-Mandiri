package com.example.challenge

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener{
            Intent(this, MainActivity::class.java).also{
                    intent-> startActivity(intent)
            }
        }

        btnSignUp.setOnClickListener{
            Intent(this, SignupActivity::class.java).also{
                    intent-> startActivity(intent)
            }
        }
    }
}
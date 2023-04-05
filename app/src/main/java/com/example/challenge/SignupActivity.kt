package com.example.challenge

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        btnSignUpRegister.setOnClickListener{
            Intent(this, LoginActivity::class.java).also{
                    intent-> startActivity(intent);
            }
        }

        btnSignInRegister.setOnClickListener{
            Intent(this, LoginActivity::class.java).also{
                    intent-> startActivity(intent);
            }
        }
    }
}
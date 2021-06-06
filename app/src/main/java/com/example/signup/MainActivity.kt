package com.example.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var etEmail=findViewById<EditText>(R.id.etEmail)
        var etPassword=findViewById<EditText>(R.id.etPassword)
        var btnLogin=findViewById<Button>(R.id.btnLogin)
        var btnSignUp=findViewById<Button>(R.id.btnSignUp)

        btnLogin.setOnClickListener {
            if (etEmail.text.toString().isEmpty() || etPassword.text.toString().isEmpty()) {
                etEmail.setError("Please input Name")
                etPassword.setError("Please Input Password")
            } else {
                Toast.makeText(baseContext, "Welcome back ", Toast.LENGTH_SHORT).show()
            }
        }
        btnSignUp.setOnClickListener {
            var intent = Intent(baseContext, SignupActivity::class.java)
            startActivity(intent)
        }


    }





}
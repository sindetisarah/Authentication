package com.example.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class SignupActivity : AppCompatActivity() {
//    lateinit var etName:EditText
//    lateinit var etEmail:EditText
//    lateinit var spGender:Spinner
//    lateinit var etPhone:EditText
//    lateinit var etPassword:EditText
//    lateinit var btnLogin1:Button
//    lateinit var btnSignUp1:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        var etName=findViewById<EditText>(R.id.etName)
        var etEmail=findViewById<EditText>(R.id.etEmail)
        var spGender=findViewById<Spinner>(R.id.spGender)

        var genders= arrayOf("Male","Female","Binary","Prefer not to say")
        var gender=ArrayAdapter(baseContext,android.R.layout.simple_spinner_item,genders)
        gender.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spGender.adapter=gender

        var etPhone=findViewById<EditText>(R.id.etPhone)
        var  etPassword=findViewById<EditText>(R.id.etPassword)
        var btnLogin1=findViewById<Button>(R.id.btnLogin1)
        var btnSignUp1=findViewById<Button>(R.id.btnSignUp1)




        btnSignUp1.setOnClickListener {
           var genders = spGender.selectedItem.toString()


            if(etName.text.toString().isEmpty()||etEmail.text.toString().isEmpty()||etPhone.text.toString().isEmpty()||etPassword.text.toString().isEmpty()){
                etName.setError("Please input Name")
                etEmail.setError("Please enter email")
                etPassword.setText("Please input Password")
                etPhone.setError("Please input Password")
            }else{
                var credentials=LoginCredentials(name=etName.text.toString(),email=etEmail.text.toString(),gender="",phone=etPhone.text.toString(),password = etPhone.text.toString())

                Toast.makeText(baseContext,credentials.toString(),Toast.LENGTH_SHORT).show()



            }
        }
        btnLogin1.setOnClickListener {
            var intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }


    }    data class LoginCredentials(var name:String,
                                var email:String,
                                var gender:String,
                                var phone:String,
                                var password:String)
}

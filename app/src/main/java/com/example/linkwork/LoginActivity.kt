package com.example.linkwork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

lateinit var btnLogin:Button
lateinit var txtforgot:TextView
lateinit var txtRigister:TextView


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        title="Login Page"
        btnLogin=findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener{ Toast.makeText(this@LoginActivity,"User Id not match or action requared",Toast.LENGTH_SHORT)
               .show()
       }


        txtforgot=findViewById(R.id.txtforgot)
        txtforgot.setOnClickListener {

            val intent=Intent(this,ForgotActivity::class.java)

           startActivity(intent)
        }
        txtRigister=findViewById(R.id.txtRigister)
        txtRigister.setOnClickListener {
            val intent=Intent(this,SignupActivity::class.java)

            startActivity(intent)
        }


    }
}
package com.example.linkwork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

lateinit var signin:TextView
class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        title="Sign In"
        signin=findViewById(R.id.signin)
        signin.setOnClickListener {
            val intent=Intent(this,LoginActivity::class.java)

            startActivity(intent)
        }
    }
}
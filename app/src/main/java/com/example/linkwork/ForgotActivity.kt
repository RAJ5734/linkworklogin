package com.example.linkwork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class ForgotActivity : AppCompatActivity() {
    lateinit var btnRecover: Button
    lateinit var txtsignIn: TextView
    lateinit var txtRigister: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot)

        title="Forgot Password"
        btnRecover=findViewById(R.id.btnRecover)
        btnRecover.setOnClickListener{ Toast.makeText(this@ForgotActivity,"Email not match or action requared",
            Toast.LENGTH_SHORT)
            .show()
        }

        txtRigister=findViewById(R.id.txtRigister)
        txtRigister.setOnClickListener {
            val intent= Intent(this,SignupActivity::class.java)
            startActivity(intent)
        }
        txtsignIn=findViewById(R.id.txtsignIn)
        txtsignIn.setOnClickListener {
            val intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)

        }





    }
}
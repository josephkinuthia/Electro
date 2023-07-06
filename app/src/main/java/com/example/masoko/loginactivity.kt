package com.example.masoko

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

import androidx.core.content.ContextCompat.startActivity

class loginactivity : AppCompatActivity() {
    private lateinit var myemail: EditText
    private lateinit var mypassword: EditText
    lateinit var login1: Button
    lateinit var signup: TextView
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginactivity)

        myemail = findViewById(R.id.email)
        mypassword = findViewById(R.id.password)
        login1 = findViewById(R.id.login)
        signup = findViewById(R.id.text)
        auth = FirebaseAuth.getInstance()


        login1.setOnClickListener {
            login()
        }

        signup.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }


    private fun login() {
        val email = myemail.text.toString()
        val pass = mypassword.text.toString()

        auth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
            if (it.isSuccessful) {
                Toast.makeText(this, "Successfully LoggedIn", Toast.LENGTH_LONG).show()
                val intent = Intent(this, advertactivity::class.java)
                startActivity(intent)
            } else

                Toast.makeText(this, "Log In failed", Toast.LENGTH_LONG).show()
        }


    }


}


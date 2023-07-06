package com.example.masoko

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class signupactivity  : AppCompatActivity(){
    lateinit var myemail: EditText
    lateinit var mypassword: EditText
    lateinit var myconfirmpasword: EditText
    lateinit var signup: Button
    lateinit var mylogin: TextView
    lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signupactivity)

        myemail = findViewById(R.id.email)
        mypassword = findViewById(R.id.password)
        myconfirmpasword = findViewById(R.id.confirmpassword)
        signup = findViewById(R.id.btnsignup)
        mylogin = findViewById(R.id.text)
        auth = Firebase.auth


        mylogin.setOnClickListener {
            val intent = Intent(this, loginactivity::class.java)
            startActivity(intent)
            finish()
        }

        signup.setOnClickListener {
            SignUp()

        }
    }

    private fun SignUp() {
        val email = myemail.text.toString()
        val pass = mypassword.text.toString()
        val confirmpassword = myconfirmpasword.text.toString()

        if (email.isBlank() || pass.isBlank() || confirmpassword.isBlank()) {
            Toast.makeText(this, "Please Email and password cant be blank", Toast.LENGTH_LONG)
                .show()
            return

        }
        else if (pass != confirmpassword) {

            Toast.makeText(this, "password do not match", Toast.LENGTH_LONG).show()
            return
        }

        auth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
            if (it.isSuccessful) {
                Toast.makeText(this, "Signed up successfully", Toast.LENGTH_LONG).show()
                val intent = Intent(this, loginactivity::class.java)
                startActivity(intent)
            }
            else {
                Toast.makeText(this, "Failed to create", Toast.LENGTH_LONG).show()
            }

        }



    }
}

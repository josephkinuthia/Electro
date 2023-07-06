package com.example.masoko

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class advertactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advertactivity)

        lateinit var map: TextView
        lateinit var facility: TextView
        lateinit var contact: TextView
        lateinit var home:TextView

            map= findViewById(R.id.map1)
            facility = findViewById(R.id.facilities)
            contact = findViewById(R.id.contact1)
            home = findViewById(R.id.home1)


            map.setOnClickListener {
                val intent = Intent(this, locationactivity::class.java)
                startActivity(intent)

            }

            facility.setOnClickListener {
                val intent = Intent(this, schgadgetactivity::class.java)
                startActivity(intent)

            }

            contact.setOnClickListener {
                val intent = Intent(this, contactactivity::class.java)
                startActivity(intent)
            }


            home.setOnClickListener {
                val intent = Intent(this, homeactivity::class.java)
                startActivity(intent)
            }
        }
    }


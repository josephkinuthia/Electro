package com.example.masoko

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import kotlinx.coroutines.NonCancellable
import org.w3c.dom.Text

class washingactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_washingactivity)

        lateinit var mybutton: Button
        lateinit var butt: Button
        lateinit var but3: Button

        mybutton = findViewById(R.id.button1)
        butt = findViewById(R.id.button2)
        but3 = findViewById(R.id.button3)

        mybutton.setOnClickListener {
            mybutton.setOnClickListener {
                val simToolKitLaunchIntent =
                    applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                simToolKitLaunchIntent?.let { startActivity(it) }
            }

            butt.setOnClickListener {
                butt.setOnClickListener {
                    val simToolKitLaunchIntent =
                        applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { startActivity(it) }
                }
            }


            but3.setOnClickListener {
                but3.setOnClickListener {
                    val simToolKitLaunchIntent =
                        applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { startActivity(it) }
                }


            }
        }
    }
}








package com.example.masoko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class tractoractivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tractoractivity)
        lateinit var mybutton: Button
        lateinit var butt: Button
        lateinit var but3: Button

        mybutton = findViewById(R.id.button11)
        butt = findViewById(R.id.button22)
        but3 = findViewById(R.id.button33)

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






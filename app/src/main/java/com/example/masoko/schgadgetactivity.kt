package com.example.masoko

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import kotlinx.coroutines.NonCancellable
import org.w3c.dom.Text

class schgadgetactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schgadgetactivity)
        lateinit var home: CardView
        lateinit var farm: CardView
        lateinit var recreation: CardView
        lateinit var cleaning: CardView
        lateinit var setting: CardView
        lateinit var logout: CardView
        lateinit var hometoolbar: Text

            home=findViewById(R.id.cardhome)
           farm=findViewById(R.id.cardchat)
            recreation=findViewById(R.id.cardperson)
            cleaning=findViewById(R.id.cardwidgets)
            setting=findViewById(R.id.cardsetting)
            logout=findViewById(R.id.cardlogout)

            home.setOnClickListener {
                Toast.makeText(applicationContext,"you have clicked Home", Toast.LENGTH_LONG).show()
                val nextpage= Intent(this,schoolactivity::class.java)
                startActivity(nextpage)

            }
            farm.setOnClickListener {
                Toast.makeText(applicationContext,"you have clicked farm gadgets", Toast.LENGTH_LONG ).show()
                val nextpage= Intent(this,farmactivity::class.java)
                startActivity(nextpage)


            }
            recreation.setOnClickListener {
                Toast.makeText(applicationContext,"you have clicked recreation gadgets", Toast.LENGTH_LONG).show()
                val nextpage= Intent(this,recreationactivity::class.java)
                startActivity(nextpage)
            }
            cleaning.setOnClickListener {
                Toast.makeText(applicationContext,"you have clicked cleaning gadget", Toast.LENGTH_LONG).show()
                val nextpage= Intent(this,cleaningactivity::class.java)
                startActivity(nextpage)
            }

            setting.setOnClickListener {
                Toast.makeText(applicationContext,"you have clicked Setting", Toast.LENGTH_LONG).show()
                val nextpage= Intent(this,settingactivity::class.java)
                startActivity(nextpage)
            }
            logout.setOnClickListener {
                Toast.makeText(applicationContext,"you have logout", Toast.LENGTH_LONG).show()
                var box= AlertDialog.Builder(this)
                box.setMessage("Do you want to close this application?")
                box.setPositiveButton("procced", DialogInterface.OnClickListener { dialog, id ->finish()  })
                box.setNegativeButton("cancel",
                    DialogInterface.OnClickListener { dialog, id -> NonCancellable.cancel() })

                var alert=box.create()
                alert.setTitle("electro app")
                alert.show()
            }
        }
    }

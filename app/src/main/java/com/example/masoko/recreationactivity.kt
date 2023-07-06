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

class recreationactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recreationactivity)
        lateinit var playstation: CardView
        lateinit var nintnedo: CardView
        lateinit var gamepads: CardView
        lateinit var logout: CardView
        lateinit var hometoolbar: Text

        playstation=findViewById(R.id.cardplaystation)
        nintnedo=findViewById(R.id.cardhome)
       gamepads=findViewById(R.id.cardperson)
        logout=findViewById(R.id.cardlogout)

        playstation.setOnClickListener {
            Toast.makeText(applicationContext,"you have clicked Home", Toast.LENGTH_LONG).show()
            val nextpage= Intent(this,playstationactivity::class.java)
            startActivity(nextpage)

        }
        gamepads.setOnClickListener {
            Toast.makeText(applicationContext,"you have clicked gamepads ", Toast.LENGTH_LONG ).show()
            val nextpage= Intent(this,nintnedoactivity::class.java)
            startActivity(nextpage)


        }
        nintnedo.setOnClickListener {
            Toast.makeText(applicationContext,"you have clicked gamepads", Toast.LENGTH_LONG).show()
            val nextpage= Intent(this,gamepadsactivity::class.java)
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


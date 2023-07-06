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

class farmactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_farmactivity)
        lateinit var lownmover: CardView
        lateinit var tractor: CardView
        lateinit var combinerharvester: CardView
        lateinit var logout: CardView
        lateinit var hometoolbar: Text

        lownmover=findViewById(R.id.cardplaystation)
        tractor=findViewById(R.id.cardhome)
       combinerharvester=findViewById(R.id.cardperson)
        logout=findViewById(R.id.cardlogout)

        tractor.setOnClickListener {
            Toast.makeText(applicationContext,"you have clicked Lownmover", Toast.LENGTH_LONG).show()
            val nextpage= Intent(this,lownmoveractivity::class.java)
            startActivity(nextpage)

        }
        lownmover.setOnClickListener {
            Toast.makeText(applicationContext,"you have clicked harvesting gadget ", Toast.LENGTH_LONG ).show()
            val nextpage= Intent(this,combineractivity::class.java)
            startActivity(nextpage)


        }
        combinerharvester.setOnClickListener {
            Toast.makeText(applicationContext,"you have clicked tractor", Toast.LENGTH_LONG).show()
            val nextpage= Intent(this,tractoractivity::class.java)
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



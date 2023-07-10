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

class settingactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settingactivity)
        lateinit var washing: CardView
        lateinit var vacuum: CardView
        lateinit var broom: CardView
        lateinit var logout: CardView
        lateinit var hometoolbar: Text

        vacuum=findViewById(R.id.cardplaystation)
        washing=findViewById(R.id.cardhome)
        broom=findViewById(R.id.cardperson)
        logout=findViewById(R.id.cardlogout)

        broom.setOnClickListener {
            Toast.makeText(applicationContext,"you have clicked vacuum ", Toast.LENGTH_LONG).show()
            val nextpage= Intent(this,instagram::class.java)
            startActivity(nextpage)

        }

        washing.setOnClickListener {
            Toast.makeText(applicationContext,"you have clicked washing gadgets ", Toast.LENGTH_LONG ).show()
            val nextpage= Intent(this,socialmediaactivity                        ::class.java)
            startActivity(nextpage)


        }
        vacuum.setOnClickListener {
            Toast.makeText(applicationContext,"you have clicked tractor", Toast.LENGTH_LONG).show()
            val nextpage= Intent(this,whatapp::class.java)
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







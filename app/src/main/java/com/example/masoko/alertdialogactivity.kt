package com.example.masoko

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import kotlinx.coroutines.NonCancellable

class alertdialogactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alertdialogactivity)

        lateinit var ImageView:Button
            ImageView=findViewById(R.id.button17)


            ImageView.setOnClickListener {
                var box= AlertDialog.Builder(this)
                box.setMessage("Do you want to close Electro?")
                box.setPositiveButton("procced", DialogInterface.OnClickListener { dialog, id ->finish()  })
                box.setNegativeButton("cancel",
                    DialogInterface.OnClickListener { dialog, id -> NonCancellable.cancel() })

                var alert=box.create()
                alert.setTitle("Electro")
                alert.show()
            }
        }
    }


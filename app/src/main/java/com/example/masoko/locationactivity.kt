package com.example.masoko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class locationactivity : AppCompatActivity() {

    lateinit var web: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_locationactivity)

            web = findViewById(R.id.web)


            web.webViewClient = WebViewClient()
            web.loadUrl("https://www.google.com/maps/place/Westlands,+Nairobi/@-1.268114,36.8048788,16z/data=!3m1!4b1!4m6!3m5!1s0x182f173c0a1f9de7:0xad2c84df1f7f2ec8!8m2!3d-1.2675001!4d36.812022!16s%2Fm%2F0265kgv?entry=ttu")
            web.settings.javaScriptEnabled = true
            web.settings.setSupportZoom(true)


        }
    }

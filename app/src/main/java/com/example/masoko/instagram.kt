package com.example.masoko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class instagram : AppCompatActivity() {
    lateinit var web: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instagram)

        web = findViewById(R.id.web1)


        web.webViewClient = WebViewClient()
        web.loadUrl("instagram.com/accounts/emailsignup/")
        web.settings.javaScriptEnabled = true
        web.settings.setSupportZoom(true)


    }
}
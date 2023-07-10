package com.example.masoko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class facebook : AppCompatActivity() {
    lateinit var web: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facebook)

        web = findViewById(R.id.web1)


        web.webViewClient = WebViewClient()
        web.loadUrl("https://www.facebook.com/")
        web.settings.javaScriptEnabled = true
        web.settings.setSupportZoom(true)


    }
}
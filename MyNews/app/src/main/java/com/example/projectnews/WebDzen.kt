package com.example.projectnews

import android.annotation.TargetApi
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button

class WebDzen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_dzen)

        /*val Button = findViewById<Button>(R.id.button)
        Button.setOnClickListener {
            val intent = Intent(this@WebDzen, MainActivity::class.java)
            startActivity(intent)
        }

            val webView3 = findViewById<WebView>(R.id.WebDzen)
            webView3.loadUrl("https://dzen.ru/")

            val webViewClient: WebViewClient = object : WebViewClient() {
                override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                    view.loadUrl(url)
                    return true
                }

                @TargetApi(Build.VERSION_CODES.N)
                override fun shouldOverrideUrlLoading(
                    view: WebView,
                    request: WebResourceRequest
                ): Boolean {
                    view.loadUrl(request.url.toString())
                    return true
                }
            }
            webView3.setWebViewClient(webViewClient)*/
    }
}


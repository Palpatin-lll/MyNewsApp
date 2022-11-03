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

class WebBBC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_bbc)

        val Button = findViewById<Button>(R.id.btn_back1)
        Button.setOnClickListener {
            val intent = Intent(this@WebBBC, MainActivity::class.java)
            startActivity(intent)
        }

        val webView2 = findViewById<WebView>(R.id.WebIZ)
        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.loadUrl("https://iz.ru/?ysclid=la13f8bal9852985154")

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
        webView2.setWebViewClient(webViewClient);
    }
}

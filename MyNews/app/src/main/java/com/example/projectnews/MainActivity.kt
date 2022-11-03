package com.example.projectnews

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn_habr)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, webpage::class.java)
            startActivity(intent)
        };

        val button1 = findViewById<Button>(R.id.btn_IZ)
        button1.setOnClickListener {
            val intent = Intent(this@MainActivity, WebBBC::class.java)
            startActivity(intent)
        };

        /*val button2 = findViewById<Button>(R.id.btn_dzen)
        button2.setOnClickListener {
            val intent = Intent(this@MainActivity, WebDzen::class.java)
            startActivity(intent)
        };*/
    }
}
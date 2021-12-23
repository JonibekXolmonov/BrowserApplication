package com.example.browserapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.vw_web_view)
        val searchButton = findViewById<Button>(R.id.btn_search)
        val inputEditText = findViewById<EditText>(R.id.edt_enter)

        searchButton.setOnClickListener {
            webView.loadUrl(inputEditText.text.toString())
        }

    }
}
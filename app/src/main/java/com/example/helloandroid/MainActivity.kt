package com.example.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// Comentário de alteração 1.1
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
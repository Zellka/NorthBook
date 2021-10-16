package com.example.northbook.ui.registration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.northbook.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
    }
}
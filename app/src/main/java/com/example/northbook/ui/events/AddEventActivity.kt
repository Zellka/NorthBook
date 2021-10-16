package com.example.northbook.ui.events

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toolbar
import com.example.northbook.R

class AddEventActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_event)
        supportActionBar?.hide()
        findViewById<Toolbar>(R.id.tol).setNavigationOnClickListener {
            finish()
        }

        findViewById<Button>(R.id.button).setOnClickListener {
            finish()
        }
    }
}
package com.example.northbook.ui.creat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toolbar
import com.example.northbook.R

class NewBookActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_book)
        supportActionBar?.hide()

        findViewById<Toolbar>(R.id.tol).setNavigationOnClickListener {
            finish()
        }

        findViewById<Button>(R.id.button).setOnClickListener {
            finish()
        }

    }
}
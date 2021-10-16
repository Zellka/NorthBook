package com.example.northbook.ui.book

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import com.example.northbook.R
import com.example.northbook.adapter.BookPagerAdapter
import com.example.northbook.databinding.ActivityBookBinding

class BookActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBookBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBookBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionsPagerAdapter = BookPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
        tabs.setupWithViewPager(viewPager)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.add_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_add -> {
                startActivity(Intent(this, AddReviewActivity::class.java))
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
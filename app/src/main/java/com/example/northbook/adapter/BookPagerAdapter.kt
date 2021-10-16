package com.example.northbook.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.northbook.R
import com.example.northbook.ui.book.DescriptionFragment
import com.example.northbook.ui.book.ReviewFragment

private val TAB_TITLES = arrayOf(
    R.string.tab_description,
    R.string.tab_review
)

class BookPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> DescriptionFragment()
            1 -> ReviewFragment()
            else -> DescriptionFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        return 2
    }
}
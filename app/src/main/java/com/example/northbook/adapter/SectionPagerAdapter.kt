package com.example.northbook.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.northbook.R
import com.example.northbook.ui.category.GenresFragment
import com.example.northbook.ui.category.RecomFragment
import com.example.northbook.ui.category.TrendsFragment

private val TAB_TITLES = arrayOf(
    R.string.tab_genres,
    R.string.tab_recom,
    R.string.tab_trends
)

class SectionPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> GenresFragment()
            1 -> RecomFragment()
            2 -> TrendsFragment()
            else -> GenresFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        return 3
    }
}
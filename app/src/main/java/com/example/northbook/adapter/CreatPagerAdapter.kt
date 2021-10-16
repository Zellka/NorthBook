package com.example.northbook.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.northbook.R
import com.example.northbook.ui.book.DescriptionFragment
import com.example.northbook.ui.creat.MyWorkFragment
import com.example.northbook.ui.creat.WorksReadersFragment

private val TAB_TITLES = arrayOf(
    R.string.chit_work,
    R.string.my_work
)

class CreatPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> WorksReadersFragment()
            else -> MyWorkFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        return 2
    }
}
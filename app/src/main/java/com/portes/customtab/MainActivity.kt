package com.portes.customtab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.portes.customtab.tab.HelperSectionsPagerAdapter
import com.portes.customtab.tab.OneFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mSections = HelperSectionsPagerAdapter(supportFragmentManager)
        tl_calendar.setupWithViewPager(pager)

        mSections.addFragment(OneFragment.newInstance(), "Uno")
        mSections.addFragment(OneFragment.newInstance(), "Dos")

        pager.adapter = mSections
    }
}

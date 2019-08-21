package com.portes.customtab.tab

import android.content.Context
import android.util.AttributeSet
import androidx.core.content.ContextCompat
import com.google.android.material.tabs.TabLayout
import android.widget.TextView
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import com.portes.customtab.R


/**
 * @author AP - May 31,2019.
 * @version 0.1.0
 * @since 0.1.0
 */
class HelperTabLayout(context: Context, attrs: AttributeSet) :
    TabLayout(context, attrs) {
    companion object {
        const val TAG = "HelperTabLayout"
    }

    init {
        init()
    }

    fun init() {
        setTabTextColors(
            ContextCompat.getColor(context, R.color.colorPrimaryDark), ContextCompat.getColor(context,
                R.color.dullRed
            )
        )

        addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabReselected(p0: Tab) {
            }

            override fun onTabUnselected(p0: Tab) {
                val mTypeface = ResourcesCompat.getFont(context, R.font.rams_bold)
                val mainView = getChildAt(0) as ViewGroup
                val tabView = mainView.getChildAt(p0.position) as ViewGroup
                val tabViewChild = tabView.getChildAt(1)
                (tabViewChild as TextView).typeface = mTypeface
            }

            override fun onTabSelected(p0: Tab) {
                val mTypeface = ResourcesCompat.getFont(context, R.font.rams)
                val mainView = getChildAt(0) as ViewGroup
                val tabView = mainView.getChildAt(p0.position) as ViewGroup
                val tabViewChild = tabView.getChildAt(1)
                (tabViewChild as TextView).typeface = mTypeface
            }

        })

    }
}
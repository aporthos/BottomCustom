package com.portes.customtab.tab

import android.content.Context
import androidx.viewpager.widget.ViewPager
import android.view.MotionEvent
import android.util.AttributeSet

/**
 * @author AP - May 31,2019.
 * @version 0.1.0
 * @since 0.1.0
 */
class NonSwipeableViewPager(context: Context, attrs: AttributeSet) : ViewPager(context, attrs) {

    override fun onInterceptTouchEvent(event: MotionEvent): Boolean {
        return false
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        return false
    }
}
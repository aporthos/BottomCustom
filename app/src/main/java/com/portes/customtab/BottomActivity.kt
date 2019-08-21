package com.portes.customtab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.portes.customtab.tab.HelperSectionsPagerAdapter
import com.portes.customtab.tab.OneFragment
import kotlinx.android.synthetic.main.lyt_purchase_bottomsheet.*

class BottomActivity : AppCompatActivity() {

    private var bottomSheetPurchase: BottomSheetBehavior<LinearLayout>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom)

        initView()

        val mSections = HelperSectionsPagerAdapter(supportFragmentManager)
        mSections.addFragment(OneFragment.newInstance(), "Uno")
//        mSections.addFragment(OneFragment.newInstance(), "Dos")

        vp_purchase_detail.adapter = mSections
    }

    private fun initView() {
        bottomSheetPurchase = BottomSheetBehavior.from(ll_purchase)

        bottomSheetPurchase?.setBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(view: View, newState: Int) {
                configBottomSheet(newState)
            }

            override fun onSlide(view: View, v: Float) {

            }
        })
    }

    private fun configBottomSheet(state: Int) {
        when (state) {
            BottomSheetBehavior.STATE_COLLAPSED -> img_icon_total.setImageResource(R.drawable.ic_outline_expand_less)
            BottomSheetBehavior.STATE_EXPANDED -> img_icon_total.setImageResource(R.drawable.ic_outline_expand_more)
        }
    }
}

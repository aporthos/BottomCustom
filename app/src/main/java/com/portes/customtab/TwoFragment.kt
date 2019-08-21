package com.portes.customtab


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.portes.customtab.R
import com.portes.customtab.tab.HelperSectionsPagerAdapter
import kotlinx.android.synthetic.main.fragment_one.*


class TwoFragment : Fragment() {

    companion object {
        fun newInstance() = TwoFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        val mSections = fragmentManager?.let { HelperSectionsPagerAdapter(it) }
//        mSections?.addFragment(TwoFragment.newInstance(), "Uno")
//        mSections?.addFragment(TwoFragment.newInstance(), "Dos")
//
//        vp_purchase_detail.adapter = mSections

        return inflater.inflate(R.layout.fragment_two, container, false)
    }


}

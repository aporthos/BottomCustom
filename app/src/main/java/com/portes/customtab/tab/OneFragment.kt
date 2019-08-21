package com.portes.customtab.tab


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.portes.customtab.R
import com.portes.customtab.TwoFragment
import kotlinx.android.synthetic.main.fragment_one.view.*


class OneFragment : Fragment() {

    companion object {
        fun newInstance() = OneFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_one, container, false)
        val mSections = fragmentManager?.let { HelperSectionsPagerAdapter(it) }
        mSections?.addFragment(TwoFragment.newInstance(), "Uno")
        mSections?.addFragment(TwoFragment.newInstance(), "Dos")

        view.vp_purchase_detail_one.adapter = mSections

        return view
    }


}

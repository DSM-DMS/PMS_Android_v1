package com.example.pms_android.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pms_android.Activity.IntroduceClubActivity
import com.example.pms_android.R
import kotlinx.android.synthetic.main.fragment_introduce.*


class IntroduceFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_introduce, container, false)

        //fragment
        /*cardview1.setOnClickListener(){
            startActivity(Intent(this, IntroduceClubActivity::class.java))
            finish()
        }*/
    }
}
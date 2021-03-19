package com.example.pms_android.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import com.example.pms_android.Activity.IntroduceClubActivity
import com.example.pms_android.Activity.IntroduceCompanyActivity
import com.example.pms_android.Activity.IntroduceDeveloperActivity
import com.example.pms_android.R
import kotlinx.android.synthetic.main.fragment_introduce.*
import kotlinx.android.synthetic.main.fragment_introduce.view.*


class IntroduceFragment : androidx.fragment.app.Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        return inflater.inflate(R.layout.fragment_introduce, container, false)


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        input_develop_btn.setOnClickListener {
            val intent = Intent (getActivity(), IntroduceDeveloperActivity::class.java)
            getActivity()?.startActivity(intent)
        }

        company_btn.setOnClickListener {
            val intent = Intent (getActivity(), IntroduceCompanyActivity::class.java)
            getActivity()?.startActivity(intent)
        }

        intro_club_btn.setOnClickListener {
            val intent = Intent (getActivity(), IntroduceClubActivity::class.java)
            getActivity()?.startActivity(intent)
        }


    }
}
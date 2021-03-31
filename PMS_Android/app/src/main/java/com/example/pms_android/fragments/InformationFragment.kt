package com.example.pms_android.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import com.example.pms_android.R
//import com.example.pms_android.login.MainLoginActivity
import kotlinx.android.synthetic.main.fragment_information.*


class InformationFragment : androidx.fragment.app.Fragment() {

        lateinit var binding : FragmentInformationBinding



        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?

            
        ): View? {
            // Inflate the layout for this fragment
            binding= FragmentInformationBinding.inflate(inflater,container,false)

            binding.plusstudent.setOnClickListener(){

                //Dialog를 띄워준다.



            }

            return binding .root




        }


}






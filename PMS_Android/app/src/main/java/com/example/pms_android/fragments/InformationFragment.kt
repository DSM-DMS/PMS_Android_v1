package com.example.pms_android.fragments

import android.app.Fragment
import android.content.Context
import android.content.Intent
import android.media.session.PlaybackState
import android.os.Bundle
import android.view.KeyEvent
import android.view.KeyEvent.KEYCODE_ENTER
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import androidx.core.content.res.ComplexColorCompat.inflate
import androidx.core.graphics.drawable.DrawableCompat.inflate
import com.example.pms_android.MainActivity
import com.example.pms_android.R
import com.example.pms_android.Recycler.PointActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_information.*


class InformationFragment : androidx.fragment.app.Fragment() {



        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?

            
        ): View? {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_information, container, false)



         //다이얼로그 설정




            /*학생 이름을 추가하고 확인을 누구면  해당학생의 상세페이지로 넘어간다
            plusstudent.setOnKeyListener { v, keyCode, event ->
                if (event.action == KeyEvent.ACTION_DOWN && keyCode == KEYCODE_ENTER) {
                    // 엔터 눌렀을때 행동




                    

                }

                true
            }*/
        }

}






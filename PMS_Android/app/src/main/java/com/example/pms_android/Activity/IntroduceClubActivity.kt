package com.example.pms_android.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pms_android.R
import com.example.pms_android.fragments.IntroduceFragment
import kotlinx.android.synthetic.main.activity_introduce_club.*

class IntroduceClubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_introduce_club)

        //뒤로가기 버튼
        imageView8.setOnClickListener(){
            startActivity(Intent(this, IntroduceFragment::class.java))
            finish()
        }


    }
}
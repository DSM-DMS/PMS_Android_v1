package com.example.pms_android.Activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.pms_android.Develop_Recycler.Develop_Adapter
import com.example.pms_android.Develop_Recycler.Developer
import com.example.pms_android.R
import com.example.pms_android.fragments.IntroduceFragment
import kotlinx.android.synthetic.main.activity_introduce_developer.*

class IntroduceDeveloperActivity : AppCompatActivity() {
    //빈 배열 선
    val dataArray : ArrayList<String> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_introduce_developer)

        //돌아가기버튼
        back_btn.setOnClickListener(){
            startActivity(Intent(this, IntroduceFragment::class.java))
            finish()
        }

        var devList = arrayListOf<Developer>(
            Developer("김재원","Android","jaewon"),
            Developer("이은별","Android","eunbyul"),
            Developer("정고은","iOS(PM)","goeun"),
          
            Developer("김정빈","Server","jungbin2"),
            Developer("정지우","Server","jiwoo2"),
            Developer("강은빈","Front","eunbin"),
            Developer("이진우","Front","jinwoo")

        )

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introduce_developer)

        val mAdapter = Develop_Adapter(this, devList)
        rv_data_list.adapter = mAdapter

        val lm = GridLayoutManager(this,2)
        rv_data_list.layoutManager = lm
        rv_data_list.setHasFixedSize(true)
         }


    }
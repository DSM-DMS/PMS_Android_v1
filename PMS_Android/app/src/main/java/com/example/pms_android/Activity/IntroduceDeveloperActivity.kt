package com.example.pms_android.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.LinearLayout
import com.example.pms_android.DataAdapter
import com.example.pms_android.Model
import com.example.pms_android.R
import kotlinx.android.synthetic.main.activity_introduce_developer.*

class IntroduceDeveloperActivity : AppCompatActivity() {
    //빈 배열 선
    val dataArray : ArrayList<String> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introduce_developer)
        addDataArray()


        //여기에 한줄에 2개씩 들어가는 그리드레이아웃 넣어야한다.
        rv_data_list.layoutManager= GridLayout(this)

        rv_data_list.adapter = DataAdapter(dataArray, this)

    }

    private fun addDataArray(){

        dataArray.add("이은별")


    }
}
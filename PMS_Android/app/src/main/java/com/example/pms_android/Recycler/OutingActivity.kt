package com.example.pms_android.Recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pms_android.R

class OutingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outing)

        val OutingList =  arrayListOf<Outing>(
            Outing("다리가 아파서", "2020/1/22","+2")
        )
    }
}
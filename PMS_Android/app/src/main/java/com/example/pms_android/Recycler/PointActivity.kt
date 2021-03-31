package com.example.pms_android.Recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pms_android.R
import kotlinx.android.synthetic.main.activity_point.*

class PointActivity : AppCompatActivity() {

    val PointList =  arrayListOf<Point>(
        Point("다리가 아파서", "2020/1/22","+2")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_point)


        val mAdapter = PointAdapter(this,PointList)
        mRecyclerView.adapter = mAdapter

        val lm = LinearLayoutManager(this)
        mRecyclerView.layoutManager = lm
        mRecyclerView.setHasFixedSize(true)
    }
}
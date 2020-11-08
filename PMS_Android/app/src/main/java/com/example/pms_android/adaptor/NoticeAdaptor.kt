package com.example.pms_android.adaptor

import android.view.View
import android.widget.AdapterView
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.pms_android.R

abstract class NoticeAdaptor: RecyclerView.Adapter<RecyclerView.ViewHolder>(),OnNoticeItemClick {
val items=mutableListOf<List<Notice>>()
private lateinit var itemClickListener:OnNoticeItemClick
    fun setItemClickListener(itemClickListener: OnNoticeItemClick){
        this.itemClickListener=itemClickListener
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var view=holder as
    }
}
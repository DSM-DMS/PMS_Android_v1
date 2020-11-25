package com.example.pms_android.adaptor

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.pms_android.MainActivity
import com.example.pms_android.R
import com.example.pms_android.fragments.NotionFragment

class NoticeAdaptor(notices: MutableList<Notice>) :
    RecyclerView.Adapter<NoticeAdaptor.ViewHolder>() {
    private val items = notices

    private lateinit var itemClickListener : OnNoticeItemClick

    fun setItemClickListener(listener : OnNoticeItemClick){
        this.itemClickListener = listener

    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item: Notice = items[position]
        holder.setItem(item)
        holder.itemView.setOnClickListener {
          itemClickListener.onClick()
            Log.d("positon",position.toString())
        }
    }

    fun addItem(item: Notice) {
        items.add(item)
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val noticeTitleView = itemView.findViewById<TextView>(R.id.notice_item_title_tv)
        val noticeDateView = itemView.findViewById<TextView>(R.id.notice_item_day_tv)
        fun setItem(item: Notice) {
            noticeTitleView.text = item.noticeTitle
            noticeDateView.text = item.noticeDate
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.notice_item, parent, false)
        )
    }

    override fun getItemCount(): Int = items.size


}
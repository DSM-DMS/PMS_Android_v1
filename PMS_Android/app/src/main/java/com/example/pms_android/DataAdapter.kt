package com.example.pms_android

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.pms_android.adapter.NoticeAdapter
import kotlinx.android.synthetic.main.data_list_items.view.*

class DataAdapter(

    val items : ArrayList<String>,
    val context : Context

) : RecyclerView.Adapter<ViewHolder>(){


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvDataType.text=items[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(
            R.layout.data_list_items,
            parent,
            false
        ))
    }

    override fun getItemCount(): Int {
        return items.size
    }

}

class ViewHolder(view: View): RecyclerView.ViewHolder(view){

    val tvDataType = view.tv_data_Type!!
}
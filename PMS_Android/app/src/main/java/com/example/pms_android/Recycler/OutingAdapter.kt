package com.example.pms_android.Recycler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.pms_android.R
import kotlinx.android.synthetic.main.notice_item.view.*
import kotlinx.android.synthetic.main.outing_item.view.*

class OutingAdapter (val context: Context, val OutingList: ArrayList<Outing>){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.outing_item, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bind(OutingList[position],context)
    }

    override fun getItemCount(): Int {
        return OutingList.size
    }



    inner class Holder (itemView: View) : RecyclerView.ViewHolder(itemView){

        val outingday = itemView?.findViewById<TextView>(R.id.outing_name)
        val outingreason = itemView?.findViewById<TextView>(R.id.outing_reason)
        val outingplace = itemView?.findViewById<TextView>(R.id.outing_place)

        fun bind(outing : Outing, context : Context){

            outingday?.text = outing.outingday
            outingreason?.text = outing.outingreason
            outingplace?.text = outing.outingplace


        }

    }
}

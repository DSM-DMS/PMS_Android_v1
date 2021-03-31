package com.example.pms_android.Recycler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.pms_android.R
import kotlinx.android.synthetic.main.point_item.view.*

class PointAdapter(val context: Context, val PointList: ArrayList<Point>):

RecyclerView.Adapter<PointAdapter.Holder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.point_item, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bind(PointList[position],context)
    }

    override fun getItemCount(): Int {
        return PointList.size
    }





    inner class Holder (itemView: View) : RecyclerView.ViewHolder(itemView) {

        val reason = itemView?.findViewById<TextView>(R.id.reason_point1)
        val day =  itemView?.findViewById<TextView>(R.id.point_day)
        val score = itemView?.findViewById<TextView>(R.id.count_point)


        fun bind(point :Point, context : Context) {

            reason?.text = point.reason
            day?.text = point.day
            score?.text = point.score


        }
    }
}
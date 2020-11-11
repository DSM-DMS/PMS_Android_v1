package com.example.pms_android.adapter

import android.view.View

interface OnNoticeItemClick {
    fun onItemClick(holder:NoticeAdaptor.ViewHolder, view: View, position: Int)
}
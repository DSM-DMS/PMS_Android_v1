package com.example.pms_android.Notice

import android.view.View

interface OnNoticeItemClick {
    fun onItemClick(holder:NoticeAdapter.ViewHolder, view: View, position: Int)
}
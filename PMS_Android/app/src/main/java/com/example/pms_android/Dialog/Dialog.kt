package com.example.pms_android.Dialog

import android.content.Context
import com.example.pms_android.R

class Dialog(context: Context) {
    private val dialog = Dialog(context)

    fun MyDig() {
        dialog.show()


        dialog.setContentView(R.layout.student_code_dialog)


        //Dialog 사이즈 설정
        dialog.window!!.setLayout(windowManager.LayoutParams.MATCH_PARENT,
            windowManager.LayoutParams.WRAP_CONTENT)
        dialog.setCanceledOnTouchOutside(true)
        dialog.setCancelable(true)

    }
}


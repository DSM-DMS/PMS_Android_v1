package com.example.pms_android.mypage

import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.pms_android.R
import kotlinx.android.synthetic.main.activity_password.*

class PasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password)


        //현재 비밀번호가 맞는지 확인


        //비밀번호를 변경하시겠습니까 ? Dialog
        Check_btn.setOnClickListener(){

            val builder = AlertDialog.Builder(this)
            builder.setTitle("비밀번호를 변경하시겠습니까?")
            builder.setPositiveButton("Yes",{ dialogInterface : DialogInterface, i :Int->
                finish()
            })
            builder.setNegativeButton("No",{ dialogInterface: DialogInterface, i: Int -> })
            builder.show()



        }


        // 새로운 비밀번호 작성 + 한번 더 확인

        



    }
}
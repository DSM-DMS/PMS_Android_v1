package com.example.pms_android.mypage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.pms_android.R
import kotlinx.android.synthetic.main.activity_mypage.*

class MypageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mypage)

        //비밀번호 변경 액티비티로 넘어가기
        background5.setOnClickListener{
            val intent = Intent (this, PasswordActivity::class.java)
            startActivity(intent);



        }
    }
}
package com.example.pms_android.login

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pms_android.MainActivity
import com.example.pms_android.R
import kotlinx.android.synthetic.main.activity_login.*
import splitties.activities.start

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        login_back_button.setOnClickListener { finish() }
        login_button.setOnClickListener {

        }
    }

    private fun correctInit(getId: String, getPassword: String) {
        val shared = getSharedPreferences("getted_id", Context.MODE_PRIVATE)
        val editor = shared.edit()
        editor.putString("getted_id", getId)
        editor.apply()
    }//자동로그인을 구현하기 위한 id ,password 를 저장하는 함수

    private fun checkStart() {
        if (login_get_id.text.toString().length > 0) {
            if (login_password.text.toString().length > 0) {
//서버에 로그인 정보를 가져다 주는 부분
                start<MainActivity>()
            } else {
                Toast.makeText(applicationContext, "비밀번호를 입력해주세요", Toast.LENGTH_SHORT).show()
            }

        } else {
            Toast.makeText(applicationContext, "아이디를 입력해주세요", Toast.LENGTH_SHORT).show()
        }
    }
}
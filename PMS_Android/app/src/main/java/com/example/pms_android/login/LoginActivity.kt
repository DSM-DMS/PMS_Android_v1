package com.example.pms_android.login

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import com.example.pms_android.KeyboardManager
import com.example.pms_android.MainActivity
import com.example.pms_android.R
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_signup.*
import splitties.activities.start

class LoginActivity : AppCompatActivity() {
    val keyboard=KeyboardManager()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        passwordInit()
        login_back_button.setOnClickListener {
            start<MainLoginActivity>()
            finish()
        }
        login_button.setOnClickListener {
            checkStart()
        }
    }
    private fun passwordInit(){
        login_input_password.setOnKeyListener(View.OnKeyListener { v, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_ENTER) {
                keyboard.hideKeyboard()
                return@OnKeyListener true
            }
            false
        })
    }

    private fun correctInit(getId: String) {
        val sharedId = getSharedPreferences("auto_login", Context.MODE_PRIVATE)
        val idEditor = sharedId.edit()
        idEditor.putString("get_id", getId)
        idEditor.apply()
    }

    private fun checkStart() {
        if (login_get_id.text.toString().isNotEmpty()) {
            if (login_input_password.text.toString().isNotEmpty()) {
        //서버에 로그인 정보를 가져다 주는 부분
                if (login_autologin_checkbox.isChecked) {
                    correctInit(login_get_id.text.toString())
                }
                finish()

            } else {
                Toast.makeText(applicationContext, "비밀번호를 입력해주세요", Toast.LENGTH_SHORT).show()
            }

        } else {
            Toast.makeText(applicationContext, "아이디를 입력해주세요", Toast.LENGTH_SHORT).show()
        }
    }

}
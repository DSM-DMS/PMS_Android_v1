package com.example.pms_android.login

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.KeyEvent
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import com.example.pms_android.util.KeyboardManager
import com.example.pms_android.R
import com.example.pms_android.customview.CheckPasswordEditText.Companion.checkPasswordCheck
import kotlinx.android.synthetic.main.activity_signup.*
import splitties.activities.start

class SignupActivity : AppCompatActivity() {
    var makePasswordCheck = false
    val keyboard= KeyboardManager()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        passwordWatcher()
        passwordInit()
        signup_back_button.setOnClickListener {
            start<MainLoginActivity>()
            finish()
        }
        signup_button.setOnClickListener {
            checkStart()
        }
    }


    private fun passwordWatcher() {
        signup_get_password.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                makeErrorCheck()
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                signup_get_password_layout.isPasswordVisibilityToggleEnabled = true
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                makeErrorCheck()
                signup_get_password_layout.isPasswordVisibilityToggleEnabled = true// 공백,20자 이상 입력 불가 코드 만들기
            }

        }
        )
    }

    private fun makeErrorCheck() {
        if (signup_get_password.text.toString().length in 7..20) {
            signup_get_password_layout.isErrorEnabled = false
            signup_get_password_layout.error = null
            makePasswordCheck = true
        } else {
            signup_get_password_layout.isErrorEnabled = true
            signup_get_password_layout.error = "비밀번호의 길이를 확인하세요"
            makePasswordCheck = false
        }
    }

    private fun checkStart() {
        if (signup_get_id.text.toString().length > 0) {
            if (makePasswordCheck) {
                if (checkPasswordCheck) {
                    if (signup_get_nickname.text.toString().isNotEmpty()) {
                        //서버에 회원가입 정보 전달하는 부분
                        start<LoginActivity>()
                        finish()
                    } else {
                        Toast.makeText(applicationContext, "닉네임을 입력해주세요", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(applicationContext, "입력하신 비밀번호와 다릅니다", Toast.LENGTH_SHORT)
                        .show()
                }
            } else {
                Toast.makeText(applicationContext, "올바른 비밀번호를 입력해주세요", Toast.LENGTH_SHORT)
                    .show()
            }
        } else {
            Toast.makeText(applicationContext, "id를 확인해주세요", Toast.LENGTH_SHORT).show()
        }
    }

    private fun passwordInit(){
        signup_check_password.setOnKeyListener(View.OnKeyListener { v, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_ENTER) {
                keyboard.hideKeyboard()
                return@OnKeyListener true
            }
            false
        })
    }

}
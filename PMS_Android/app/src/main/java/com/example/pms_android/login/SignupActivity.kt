package com.example.pms_android.login

import android.graphics.Color
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import com.example.pms_android.util.KeyboardManager
import com.example.pms_android.R
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_signup.*
import splitties.activities.start

class SignupActivity : AppCompatActivity() {
    var makePasswordCheck = false
    var checkPasswordCheck = false
    private var checkDrawble: Drawable? = null

    private var baseDrawble: Drawable? = null

    val keyboard = KeyboardManager()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        checkDrawble = ContextCompat.getDrawable(applicationContext, R.drawable.ic_baseline_done_24)
        baseDrawble = ContextCompat.getDrawable(
            applicationContext,
            R.drawable.ic_baseline_check_circle_outline_24
        )
        baseDrawble?.setBounds(1, 0, baseDrawble!!.intrinsicWidth, baseDrawble!!.intrinsicHeight)
        checkDrawble?.setBounds(0, 0, checkDrawble!!.intrinsicWidth, checkDrawble!!.intrinsicHeight)
        signup_check_password.setCompoundDrawables(baseDrawble, null, checkDrawble, null)
        passwordWatcher()
        checkPasswordWatcher()
        passwordInit()
        signup_button.setOnClickListener {
            checkStart()
        }
        signup_get_password.onFocusChangeListener = View.OnFocusChangeListener { _, hasFocus ->
            signup_get_password_layout.isPasswordVisibilityToggleEnabled =
                hasFocus
        }

    }


    private fun passwordWatcher() {
        signup_get_password.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                makeErrorCheck()
                checkErrorCheck()
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                makeErrorCheck()
                checkErrorCheck()
            }

        }
        )
    }

    private fun checkPasswordWatcher() {
        signup_check_password.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                checkErrorCheck()
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                checkErrorCheck()
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

    private fun checkErrorCheck() {
        if (signup_get_password.text.toString() != signup_check_password.text.toString()) {
            checkPasswordCheck = false
            if (checkDrawble != null) {
                DrawableCompat.setTint(checkDrawble!!, Color.RED)
            }

            signup_check_password_layout.error = "비밀번호가 다릅니다"
        } else if (signup_get_password.text.toString() == signup_check_password.text.toString() && makePasswordCheck) {
            signup_check_password_layout.error = null
            checkPasswordCheck = true
            if (checkDrawble != null) {
                DrawableCompat.setTint(checkDrawble!!, Color.GREEN)
            }

        }
    }

    private fun checkStart() {
        if (signup_get_id.text.toString().isNotEmpty()) {
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

    private fun passwordInit() {
        signup_check_password.setOnKeyListener(View.OnKeyListener { _, keyCode, _ ->
            if (keyCode == KeyEvent.KEYCODE_ENTER) {
                keyboard.hideKeyboard()
                return@OnKeyListener true
            }
            false
        })
    }


}

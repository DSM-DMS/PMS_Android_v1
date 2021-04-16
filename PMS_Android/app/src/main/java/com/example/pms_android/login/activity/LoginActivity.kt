package com.example.pms_android.login.activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.Toast
import com.example.pms_android.API.ApiService
import com.example.pms_android.API.BaseApi
import com.example.pms_android.mypage.KeyboardManager
import com.example.pms_android.R
import kotlinx.android.synthetic.main.activity_login.*
import retrofit2.Retrofit
import splitties.activities.start

class LoginActivity : AppCompatActivity() {
    lateinit var retrofit: Retrofit
    lateinit var supplementService: ApiService
    val keyboard = KeyboardManager()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initRetrofit()
        passwordInit()
        login_button.setOnClickListener {
            checkStart()
        }
        login_input_password.onFocusChangeListener = View.OnFocusChangeListener { _, hasFocus ->
            login_input_password_layout.isPasswordVisibilityToggleEnabled =
                hasFocus
        }
    }

    private fun initRetrofit() {
        retrofit = BaseApi.getInstance()
        supplementService = retrofit.create(ApiService::class.java)
    }

    private fun passwordInit() {
        login_input_password.setOnKeyListener(View.OnKeyListener { _, keyCode, _ ->
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
                supplementService.login(login_get_id.text.toString(),login_input_password.text.toString())
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

    private fun loginApi(){
        supplementService.login(login_get_id.text.toString(),login_input_password.text.toString())
    }

    override fun onBackPressed() {
        start<MainLoginActivity>()
        finish()
        super.onBackPressed()
    }
}
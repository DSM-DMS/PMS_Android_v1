package com.example.pms_android.mypage

import android.content.Context
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_signup.*

class KeyboardManager:AppCompatActivity() {
    fun hideKeyboard() {
        val key = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        key.hideSoftInputFromWindow(signup_get_password.windowToken, 0)
    }
}
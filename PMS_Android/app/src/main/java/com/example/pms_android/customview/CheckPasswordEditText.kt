package com.example.pms_android.customview

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.View
import androidx.annotation.NonNull
import androidx.appcompat.widget.AppCompatEditText
import kotlinx.android.synthetic.main.activity_signup.*
import kotlinx.android.synthetic.main.activity_signup.view.*

class CheckPasswordEditText:AppCompatEditText,TextWatcher {

    companion object{
        var checkPasswordCheck = false
    }
    constructor(context: Context):super(context)
    constructor(context:Context,attrs: AttributeSet?):super(context,attrs)
    constructor(context: Context,attrs:AttributeSet?,defStyleAttr:Int):super(context,attrs,defStyleAttr)

    private fun checkErrorCheck() {
        if (signup_check_password.text.toString() != signup_check_password.text.toString()) {
            signup_check_password_layout.isErrorEnabled = true
            signup_check_password_layout.error = "비밀번호가 다릅니다"
            checkPasswordCheck = false
        } else {
            signup_check_password_layout.isErrorEnabled = false
            signup_check_password_layout.error = null
            checkPasswordCheck = true
        }
    }
    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        checkErrorCheck()
    }
    override fun afterTextChanged(s: Editable?) {
        checkErrorCheck()
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        signup_get_password_layout.isPasswordVisibilityToggleEnabled = false
    }

}
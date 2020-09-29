package com.example.pms_android.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pms_android.R
import kotlinx.android.synthetic.main.activity_main_login.*
import splitties.activities.start

class MainLoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_login)
        start_login_button.setOnClickListener {
            start<LoginActivity>()
        }
        start_signin_button.setOnClickListener {
            start<SigninActivity>()
        }
    }
}
package com.example.pms_android.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pms_android.R
import kotlinx.android.synthetic.main.activity_main_login.*
import splitties.activities.start

class MainLoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_login)
        mainlogin_button_startlogin.setOnClickListener {
            start<LoginActivity>()
            finish()
        }
        mainlogin_button_startsignup.setOnClickListener {
            start<SignupActivity>()
            finish()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        moveTaskToBack(true)
        finish()
        android.os.Process.killProcess(android.os.Process.myPid())

    }
}
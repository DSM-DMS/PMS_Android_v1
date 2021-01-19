package com.example.pms_android.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pms_android.R
import com.example.pms_android.fragments.IntroduceFragment
import kotlinx.android.synthetic.main.activity_introduce_company.*
import splitties.activities.start

class IntroduceCompanyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introduce_company)

        imageView13.setOnClickListener() {
            startActivity(Intent(this, IntroduceFragment::class.java))
            finish()
        }
    }
}
package com.example.pms_android.mypage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pms_android.Recycler.PointActivity
import com.example.pms_android.R
import com.example.pms_android.login.MainLoginActivity
import kotlinx.android.synthetic.main.activity_mypage.*

class MypageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mypage)

        //비밀번호 변경 액티비티로 넘어가기
        background5.setOnClickListener{
            val intent = Intent (this, PasswordActivity::class.java)
            startActivity(intent);

        //상벌점 목록으로 넘어가기
        background4.setOnClickListener{
            val intent = Intent (this, PointActivity::class.java)
            startActivity(intent);
        }

            //로그아웃으로 넘어가기
            background6.setOnClickListener{
                val intent = Intent(this,MainLoginActivity::class.java)
                startActivity(intent);
            }

          //상벌점으로 들어가기
         goodpoint.setOnClickListener{
             val intent=Intent(this,PointActivity::class.java)
             startActivity(intent)
         }

          badpoint.setOnClickListener{
                val intent=Intent(this,PointActivity::class.java)
                startActivity(intent)
            }




        }
    }
}
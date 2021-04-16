package com.example.pms_android.API

import com.example.pms_android.login.model.LoginResponse
import retrofit2.Response
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Query
interface ApiService{


    //비밀번호 변경
    @PUT("auth/password")
    fun putAuthPassword(
        @Query("password")password:String,
        @Query("pre-password")prePassword:String

    ):Response<Any>


    //학생 등록
    @POST("user/student")
    fun SignStudent(
        @Query("number")studentnumber:String
    ): Response<Any>
    //return 값이 없다.


    //회원가입
    @POST("user")
    fun signUp(
        @Query("email")email:String,
        @Query("name")name:String,
        @Query("password")password:String
    ):Response<Any>

    //로그인
    @POST("auth")
    fun login(
        @Query("email")email:String,
        @Query("password")password:String
    ):Response<LoginResponse>






}
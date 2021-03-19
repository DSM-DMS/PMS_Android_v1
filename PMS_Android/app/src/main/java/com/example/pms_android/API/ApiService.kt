package com.example.pms_android.API

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





}
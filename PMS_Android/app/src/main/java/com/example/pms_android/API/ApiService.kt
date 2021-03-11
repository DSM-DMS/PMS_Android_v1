package com.example.pms_android.API

import retrofit2.Response
import retrofit2.http.PUT
import retrofit2.http.Query
interface ApiService{

    @PUT("auth/password")
    fun putAuthPassword(
        @Query("password")password:String,
        @Query("pre-password")prePassword:String

    ):Response<Any>

}
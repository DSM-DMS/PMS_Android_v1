package com.example.pms_android.API

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object BaseApi {
//API를 연결하기 전

    private var instance : Retrofit?=null
    private const val BASE_URL= "api.smooth-bear.live/ "

    fun getInstance():Retrofit{
        if(instance == null){
            instance = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()


            
        }
        return instance!!
    }





}


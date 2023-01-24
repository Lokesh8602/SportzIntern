package com.example.sportzinter.api

import com.example.sportzinter.pojo.MatchData
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface RetroServices {
    @GET("sapk01222019186652.json")
    suspend fun getMatchData(

   ): Response<MatchData>
    @GET("nzin01312019187360.json")
    suspend fun getIndNew(): Response<MatchData>




    companion object {

        var retrofitService: RetroServices? = null

        fun getInstance() : RetroServices {

            if (retrofitService == null) {
                val retrofit = Retrofit.Builder()
                    .baseUrl(" https://demo.sportz.io/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

                retrofitService = retrofit.create(RetroServices::class.java)
            }
            return retrofitService!!
        }
    }
}
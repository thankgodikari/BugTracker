package com.codenovate.bugtracker.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitInstance {


    private const val BASE_URL =
        "https://example.com/"


    val api: IssueApiService by lazy {

        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(
                GsonConverterFactory.create()
            )
            .build()
            .create(IssueApiService::class.java)

    }

}
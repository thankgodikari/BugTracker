package com.codenovate.bugtracker.data.remote

import com.codenovate.bugtracker.data.local.IssueEntity
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface IssueApiService {


    @GET("issues")
    fun getIssues(): List<IssueEntity>


    @POST("issues")
    fun createIssue(
        @Body issue: IssueEntity
    )


    @PUT("issues/{id}")
    fun updateIssue(
        @Path("id") id: Int,
        @Body issue: IssueEntity
    )


    @DELETE("issues/{id}")
    fun deleteIssue(
        @Path("id") id: Int
    )

}
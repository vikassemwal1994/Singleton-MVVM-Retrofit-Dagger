package com.example.singleton_mvvm_retrofit_dagger.api

import com.example.singleton_mvvm_retrofit_dagger.models.User
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService{

    @GET("placeholder/user/{userId}")
    suspend fun getUser(
        @Path("userId") userId : String
    ) : User

}
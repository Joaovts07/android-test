package com.example.android_test_einstein.data;

import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JsonApi {
    @GET("jokes/random")
    suspend fun getRandomJoke(@Query("category"))
}

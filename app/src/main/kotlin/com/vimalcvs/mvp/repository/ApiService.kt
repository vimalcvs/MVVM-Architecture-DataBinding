package com.vimalcvs.mvp.repository

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("api/api.php")
    suspend fun getCategories(
        @Query("categories") categories: String = "true",
        @Query("api_key") apiKey: String
    ): CategoriesResponse
}

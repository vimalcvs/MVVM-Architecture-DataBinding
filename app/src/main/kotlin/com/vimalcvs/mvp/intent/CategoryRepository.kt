package com.vimalcvs.mvp.intent

import com.vimalcvs.mvp.repository.RetrofitInstance

class CategoryRepository {
    suspend fun getCategories(string: String) = RetrofitInstance.api.getCategories(
        "categories",
        string
    )
}

package com.vimalcvs.mvp.repository

import com.vimalcvs.mvp.model.Category


data class CategoriesResponse(
    val status: String,
    val count: Int,
    val categories: List<Category>
)
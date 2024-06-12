package com.vimalcvs.mvp.intent


import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.vimalcvs.mvp.model.Category
import kotlinx.coroutines.Dispatchers

class CategoryViewModel : ViewModel() {

    private val repository = CategoryRepository()

    fun fetchCategories(string: String): LiveData<List<Category>> {
        return liveData(Dispatchers.IO) {
            val response = repository.getCategories(string)
            emit(response.categories)
        }
    }
}

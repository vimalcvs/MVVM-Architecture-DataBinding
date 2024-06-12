package com.vimalcvs.mvp.ui


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.vimalcvs.mvp.adapter.CategoryAdapter
import com.vimalcvs.mvp.databinding.ActivityMainBinding
import com.vimalcvs.mvp.intent.CategoryViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: CategoryViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[CategoryViewModel::class.java]

        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        viewModel.fetchCategories("cda11lHY0ZafN2nrti4U5QAKMDhTw7Czm1xoSsyVLduvRegkqE").observe(this) { categories ->
            binding.recyclerView.adapter = CategoryAdapter(categories)
        }
    }
}

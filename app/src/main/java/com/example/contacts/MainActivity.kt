package com.example.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.contacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupAdapter(binding)
    }

    fun setupAdapter(binding: ActivityMainBinding) {
        val categoryList = listOf("Family", "Favorites", "Friend", "Colleagues", "Tutors")
        val adapter = CategoryAdapter(categoryList)
        binding.categoryRecyclerView.adapter = adapter
    }
}
package com.example.posts.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.posts.R
import com.example.posts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}
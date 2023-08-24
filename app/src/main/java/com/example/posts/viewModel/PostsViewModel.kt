package com.example.posts.viewModel

import androidx.lifecycle.liveData
import com.example.posts.repository.PostsRepository
import retrofit2.Response

class PostsViewModel {
      val postsRepo= PostsRepository()
      fun fetchPosts(){
        viewModelScope.launch {
            val response =postsRepo.getPosts()
        }
    }

}
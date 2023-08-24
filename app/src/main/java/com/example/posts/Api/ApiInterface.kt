package com.example.posts.Api

import com.example.posts.models.Posts
import com.example.posts.models.PostsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {
    @GET("/posts")
    suspend fun getPosts(): Response<PostsResponse>
    @GET("/posts{id}")
    suspend fun getPosts(@Path("id")postId:Int):Response<Posts>
}
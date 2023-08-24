package com.example.posts.models

import retrofit2.Response

data class PostsResponse(
    val posts:List<Posts>,
    var userId:Int,
    var id:Int,
    var title: String,
    var body:String

)

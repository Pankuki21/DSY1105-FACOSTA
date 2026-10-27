package com.duoc.appfacosta.data.remote

import com.duoc.appfacosta.data.model.Post
import retrofit2.http.GET

interface ApiService{

    @GET("/posts")
    suspend fun getPosts(): List<Post>
}
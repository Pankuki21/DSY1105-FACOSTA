package com.duoc.appfacosta.repository

import com.duoc.appfacosta.data.model.Post
import com.duoc.appfacosta.data.remote.RetrofitInstance

class PostRepository {
    suspend fun getPosts(): List<Post> {
        return RetrofitInstance.api.getPosts()
    }
}
package com.dicoding.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class ListMovieResponse (

    @field:SerializedName("dates")
    val dates: DateResponse,

    @field:SerializedName("page")
    val page: Int,

    @field:SerializedName("results")
    val results: List<MovieResponse>
)

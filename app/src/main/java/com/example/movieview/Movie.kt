package com.example.movieview

import com.google.gson.annotations.SerializedName


class Movie {
    @SerializedName("poster_path")
    var movieImageUrl: String? = null

    annotation class SerializedName(val value: String)

    @JvmField
    @SerializedName("title")
    var title: String? = null

    @JvmField
    @SerializedName("overview")
    var description: String? = null
}
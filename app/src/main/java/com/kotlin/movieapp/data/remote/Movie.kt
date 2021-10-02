package com.kotlin.movieapp.data.remote

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

// for response
@Parcelize
data class Movie (
    val id: String,
    val overview: String?,
    val poster_path: String,
    val original_title: String
): Parcelable{
    val baseUrl: String get() = "https://image.tmdb.org/t/p/w500"
}
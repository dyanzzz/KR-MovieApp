package com.kotlin.movieapp.ui.movie

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.kotlin.movieapp.data.remote.MovieRepository

class MovieViewModel @ViewModelInject constructor(repository: MovieRepository): ViewModel() {
    val movies = repository.getNowPlayingMovies()
}
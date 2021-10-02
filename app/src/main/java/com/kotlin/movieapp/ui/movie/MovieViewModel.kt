package com.kotlin.movieapp.ui.movie

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.kotlin.movieapp.data.remote.MovieRepository

class MovieViewModel @ViewModelInject constructor(private val repository: MovieRepository): ViewModel() {
}
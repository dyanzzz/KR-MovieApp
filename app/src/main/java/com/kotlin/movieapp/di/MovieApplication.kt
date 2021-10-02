package com.kotlin.movieapp.di

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//  using dependency injection hilt
@HiltAndroidApp
class MovieApplication: Application() {
}
package com.hamzathedev.klivvrcitysearch

import android.app.Application
import com.hamzathedev.klivvrcitysearch.data.repository.CityRepository

class MyApp : Application() {
    val cityRepository: CityRepository by lazy {
        CityRepository(this)
    }
}
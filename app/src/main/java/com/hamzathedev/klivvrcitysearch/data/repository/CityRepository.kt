package com.hamzathedev.klivvrcitysearch.data.repository

import android.content.Context
import com.hamzathedev.klivvrcitysearch.data.model.City
import kotlinx.serialization.json.Json


class CityRepository(private val context: Context) {

    private lateinit var cities: List<City>

    fun loadCitiesFromAsset() {
        val jsonString = context.assets.open("cities.json").bufferedReader().use { it.readText() }
        val json = Json { ignoreUnknownKeys = true }
        cities = json.decodeFromString(jsonString)
    }

    fun getCities(): List<City> {
        return cities
    }

    fun searchCities(prefix: String): List<City> {
        return cities.filter { it.name.startsWith(prefix, ignoreCase = true) }
            .sortedBy { it.name }
    }

}
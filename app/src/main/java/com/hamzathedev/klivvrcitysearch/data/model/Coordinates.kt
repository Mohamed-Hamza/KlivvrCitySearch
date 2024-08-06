package com.hamzathedev.klivvrcitysearch.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Coordinates(
    val lon: Double,
    val lat: Double
)

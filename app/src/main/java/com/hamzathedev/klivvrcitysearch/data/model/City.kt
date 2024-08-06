package com.hamzathedev.klivvrcitysearch.data.model

import kotlinx.serialization.Serializable

@Serializable
data class City(
    val country: String,
    val name: String,
    val _id: Int,
    val coord: Coordinates
)


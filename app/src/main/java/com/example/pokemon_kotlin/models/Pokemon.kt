package com.example.pokemon_kotlin.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Pokemon (
    @Json(name = "name") val pokeName: String,
    @Json(name = "weight") val pokeWeight: String,
    @Json(name = "id") val pokeId: Int
)
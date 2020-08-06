package com.example.pokemon_kotlin.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Pokemon (
    @Json(name = "name") val pokeName: String,
    @Json(name = "weight") val pokeWeight: String,
    @Json(name = "id") val pokeId: Int,
    @Json(name = "abilities") val pokeAbilities: List<Abilities>,
    @Json(name = "forms") val pokeForms: List<Forms>,
    @Json(name ="moves") val pokeMoves: List<Moves>
)

@JsonClass(generateAdapter = true)
data class Abilities (
    @Json(name = "ability") val ability: Ability
)

@JsonClass(generateAdapter = true)
data class Ability (
    val name: String,
    val url: String
)

@JsonClass(generateAdapter = true)
data class Forms (
    @Json(name = "name") val name: String,
    @Json(name = "url") val url: String
)

@JsonClass(generateAdapter = true)
data class Moves (
    @Json(name = "move") val move: Move
)

@JsonClass(generateAdapter = true)
data class Move (
    @Json(name = "name") val name: String,
    @Json(name = "url") val url: String
)
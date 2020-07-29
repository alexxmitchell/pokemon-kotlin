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
data class Abilities (
    @Json(name = "ability") val ability: List<Ability>
)

data class Ability (
    val name: String,
    val url: String
)

data class Forms (
    @Json(name = "name") val name: String,
    @Json(name = "url") val url: String
)

data class Moves (
    @Json(name = "move") val move: List<Move>
)

data class Move (
    val name: String,
    val url: String
)
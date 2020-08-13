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
    @Json(name = "moves") val pokeMoves: List<Moves>,
    @Json(name = "sprites") var pokeImg: Sprites
)

@JsonClass(generateAdapter = true)
data class Abilities (
    @Json(name = "ability") val ability: Ability
)

@JsonClass(generateAdapter = true)
data class Ability (
    @Json(name = "name") val name: String,
    @Json(name = "url") val url: String
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

@JsonClass(generateAdapter = true)
data class Sprites (
    @Json(name = "front_default") val frontDefault: String,
    @Json(name = "front_shiny") val frontShiny: String
)


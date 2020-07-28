package com.example.pokemon_kotlin.network

import retrofit2.http.GET


interface PokemonService {
    @GET("https://pokeapi.co/api/v2")

}
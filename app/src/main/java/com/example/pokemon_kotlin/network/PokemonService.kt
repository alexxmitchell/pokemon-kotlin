package com.example.pokemon_kotlin.network

import com.example.pokemon_kotlin.models.Pokemon
import retrofit2.http.GET
import retrofit2.http.Path
import kotlin.random.Random


interface PokemonService {
    @GET("pokemon/{randomIndex}")
    //adding random number automatically, but may want user to be able to send in
    suspend fun getRandomPokemon(@Path("randomIndex") randomIndex: Int): Pokemon


    //paginated pokemon
   // @GET("pokemon?limit=36")
}
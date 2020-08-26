package com.example.pokemon_kotlin.network

import com.example.pokemon_kotlin.models.Pokemon
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import kotlin.random.Random


interface PokemonService {
    @GET("pokemon/{randomIndex}")
    //adding random number automatically, but may want user to be able to send in
    suspend fun getRandomPokemon(@Path("randomIndex") randomIndex: Int = Random.nextInt(300)): Pokemon


    //paginated pokemon
    //defaults go at the end
    @GET("pokemon")
    suspend fun getPokemonList(@Query("offset") offset: Int, @Query("limit") limit: Int = 36): List<Pokemon>


}
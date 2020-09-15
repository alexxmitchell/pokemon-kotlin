package com.example.pokemon_kotlin.application

import com.example.pokemon_kotlin.network.PokemonService
import com.example.pokemon_kotlin.ui.pokeList.PokeListViewModel
import com.example.pokemon_kotlin.ui.pokemon.PokemonViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


val appModule = module {
    single {
        Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(PokemonService::class.java)
    }

    viewModel { PokemonViewModel(pokemonService = get()) }
    viewModel { PokeListViewModel(pokemonService = get()) }

}


package com.example.pokemon_kotlin.ui.pokemon

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokemon_kotlin.models.Pokemon

import com.example.pokemon_kotlin.network.PokemonService
import kotlinx.coroutines.launch
import kotlin.random.Random

class PokemonViewModel(private val pokemonService: PokemonService): ViewModel() {
    val pokemon = MutableLiveData<Pokemon>()


    fun getRandomPokemon(){
        viewModelScope.launch {
            val randomPokemon = pokemonService.getRandomPokemon(1)
            pokemon.postValue(randomPokemon)

        }
    }
}
package com.example.pokemon_kotlin.ui.pokemon

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokemon_kotlin.models.Pokemon
import com.example.pokemon_kotlin.network.PokemonService
import kotlinx.coroutines.launch

class PokemonViewModel(private val pokemonService: PokemonService): ViewModel() {
    val pokemon = MutableLiveData<Pokemon>()


    fun getRandomPokemon(){
        viewModelScope.launch {
            val randomPokemon = pokemonService.getRandomPokemon()
            pokemon.postValue(randomPokemon)
            Log.i("randomPokemon", pokemon.value.toString())
        }
    }
}
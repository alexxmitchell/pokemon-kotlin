package com.example.pokemon_kotlin.ui.pokeList

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokemon_kotlin.models.Pokemon
import com.example.pokemon_kotlin.models.PokemonList
import com.example.pokemon_kotlin.models.Result
import com.example.pokemon_kotlin.network.PokemonService
import kotlinx.coroutines.launch

class PokeListViewModel(private val pokemonService: PokemonService): ViewModel() {
    val pokemonList = MutableLiveData<List<Result>>()
    var pokemon = MutableLiveData<Pokemon>()
    var count = 0


    fun getPokemonList(){
        viewModelScope.launch {
            val list = pokemonService.getPokemonList(count * 36)
            val currentList = (pokemonList.value ?: emptyList()).toMutableList()
                currentList.addAll(list.results)
            pokemonList.postValue(currentList)
            count++
        }
    }

    fun getSpecificPokemon(name: String) {
        viewModelScope.launch {

            val specificPokemon = pokemonService.getSpecificPokemon(name)
            Log.i("alexx" , specificPokemon.toString())
            pokemon.postValue(specificPokemon)

        }
    }

    fun getRandomPokemon(){
        viewModelScope.launch {
            val randomPokemon = pokemonService.getRandomPokemon()
            pokemon.postValue(randomPokemon)

        }
    }

}
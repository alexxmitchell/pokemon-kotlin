package com.example.pokemon_kotlin.ui.pokeList

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



    fun getPokemonList(){
        viewModelScope.launch {
            val list = pokemonService.getPokemonList(0)
            val currentList = (pokemonList.value ?: emptyList()).toMutableList()
                currentList.addAll(list.results)
            pokemonList.postValue(currentList)
        }
    }
}
package com.example.pokemon_kotlin.ui.pokeList

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemon_kotlin.databinding.ListItemPokemonBinding
import com.example.pokemon_kotlin.models.Result

class PokeListAdapter : RecyclerView.Adapter<PokeListAdapter.PokeListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokeListViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: PokeListViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class PokeListViewHolder(binding: ListItemPokemonBinding) : RecyclerView.ViewHolder(binding.root){
        val pokeName : TextView = binding.pokemonListName


        fun bindPokeItems(result: Result) {
            pokeName.text = result.name
        }
    }
}
package com.example.pokemon_kotlin.ui.pokeList

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemon_kotlin.R
import com.example.pokemon_kotlin.databinding.ListItemPokemonBinding
import com.example.pokemon_kotlin.models.PokemonList
import com.example.pokemon_kotlin.models.Result

class PokeListAdapter : RecyclerView.Adapter<PokeListAdapter.PokeListViewHolder>() {
    var list: List<Result> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }
    //lambda function variable
    var onItemClick: ((String) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokeListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemPokemonBinding.inflate(inflater, parent, false)
        return PokeListViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: PokeListViewHolder, position: Int) {
        holder.pokeName.text = list[position].name
    }

    fun updatePokeList(list: List<Result>){
        this.list = list
    }

    inner class PokeListViewHolder(binding: ListItemPokemonBinding) : RecyclerView.ViewHolder(binding.root){
        val pokeName : TextView = binding.pokemonListName
        init {
            pokeName.setOnClickListener{
                //invoke makes it a function
                onItemClick?.invoke(list[adapterPosition].name)}
        }




    }
}
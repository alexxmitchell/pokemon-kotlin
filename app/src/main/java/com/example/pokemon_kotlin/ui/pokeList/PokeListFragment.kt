package com.example.pokemon_kotlin.ui.pokeList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pokemon_kotlin.R
import com.example.pokemon_kotlin.databinding.FragmentPokemonListBinding
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class PokemonListFragment: Fragment() {
    private lateinit var binding: FragmentPokemonListBinding
    private lateinit var pokeListAdapter: PokeListAdapter
    private val viewModel: PokeListViewModel by sharedViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.pokemonList.observe( this, Observer{
            pokeListAdapter.updatePokeList(it)
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPokemonListBinding.inflate(inflater, container, false)
        pokeListAdapter = PokeListAdapter()
        setupRecyclerView()
        return binding.root
    }

    private fun setupRecyclerView(){
        binding.pokemonList.adapter = pokeListAdapter
        binding.pokemonList.layoutManager = LinearLayoutManager(context)
        val dividerDecoration =  DividerItemDecoration(context, DividerItemDecoration.VERTICAL)
        binding.pokemonList.addItemDecoration(dividerDecoration)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getPokemonList()
        //lambda function
        pokeListAdapter.onItemClick = {
            viewModel.getSpecificPokemon(it)
            findNavController().navigate(R.id.action_pokemonListFragment_to_PokemonFragment)
        }



    }


}
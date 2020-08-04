package com.example.pokemon_kotlin.ui.pokemon

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.pokemon_kotlin.R
import com.example.pokemon_kotlin.databinding.FragmentPokemonBinding
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class PokemonFragment: Fragment() {
    val viewModel: PokemonViewModel by sharedViewModel()
    private lateinit var binding: FragmentPokemonBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_pokemon, container, false)
        binding.pokemonViewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        viewModel.getRandomPokemon()

    }
}
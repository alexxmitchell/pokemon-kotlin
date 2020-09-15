package com.example.pokemon_kotlin.ui.chooseRoute

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.pokemon_kotlin.R
import kotlinx.android.synthetic.main.fragment_choose_route.*

class ChooseRouteFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_choose_route, container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view_random_button.setOnClickListener {
            findNavController().navigate(R.id.action_chooseRouteFragment_to_PokemonFragment)
        }
        view_list_button.setOnClickListener {
            findNavController().navigate(R.id.action_chooseRouteFragment_to_pokemonListFragment)
        }

    }
}
package com.example.pokemon_kotlin.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.api.load

object ImageViewAdapter {

    @JvmStatic

    //@bindingAdapter - tells us that its not a regular function; its called automatically from the xml
    @BindingAdapter("imageUrl")
    fun loadImage(imageView: ImageView, url: String?) {
        imageView.load(url)
    }
}
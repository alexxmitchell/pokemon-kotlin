package com.example.pokemon_kotlin.application

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        //starts the Koin Context
        startKoin{
            androidContext(this@MainApplication)
            modules(appModule)
        }
    }
}
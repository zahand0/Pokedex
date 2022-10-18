package com.example.pokedex.di

import com.example.pokedex.repository.IPokemonRepository
import com.example.pokedex.repository.PokemonRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {
    @Binds
    fun providePokemonRepository(repository: PokemonRepository): IPokemonRepository
}
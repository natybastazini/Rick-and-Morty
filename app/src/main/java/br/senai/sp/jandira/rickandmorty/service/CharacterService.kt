package br.senai.sp.jandira.rickandmorty.service

import br.senai.sp.jandira.rickandmorty.model.Character
import br.senai.sp.jandira.rickandmorty.model.Result
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterService {

    @GET("character")
    fun gelAllCharacteres() : Call<Result>

    @GET("character/{id}")
    fun getCharacterById(@Path("id") id: Int): Call<Character>


}
package com.ohgiraffers.section02.annotation.subsection03.collection;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("pokemonServiceCollection")
public class PokemonService {

    /* 설명. 1. 같은 타입의 bean을 List 형태로 주입 */
    private final List<Pokemon> pokemonList;

    @Autowired
    public PokemonService(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }


    public void pokemonAttack() {
        pokemonList.forEach(pokemon -> pokemon.attack());
    }
}

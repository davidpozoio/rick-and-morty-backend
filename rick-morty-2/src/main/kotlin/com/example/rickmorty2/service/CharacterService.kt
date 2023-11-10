package com.example.rickmorty2.service

import com.example.rickmorty2.model.Character
import com.example.rickmorty2.repository.CharacterRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CharacterService {
    @Autowired
    lateinit var characterRepository: CharacterRepository

    fun getAll(): List<Character>{
        return characterRepository.findAll()
    }

    fun post(character: Character): Character{
        return  characterRepository.save(character)
    }
}
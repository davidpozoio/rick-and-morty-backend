package com.example.rickmorty2.repository

import com.example.rickmorty2.model.Character
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CharacterRepository: JpaRepository<Character, Long>{

}
package com.example.rickmorty2.controller

import com.example.rickmorty2.model.Character
import com.example.rickmorty2.service.CharacterService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.DELETE])
@RestController
@RequestMapping("/characters")
class CharacterController {
    @Autowired
    lateinit var characterService: CharacterService

    @GetMapping
    fun getAll(): List<Character>{
        return characterService.getAll()
    }

    @PostMapping
    fun post(@RequestBody character: Character): Character{
        return characterService.post(character)
    }
}
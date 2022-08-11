package com.turbo.repository

import com.turbo.model.Character
import kotlinx.coroutines.flow.Flow
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface CharacterRepository : CoroutineCrudRepository<Character, Long> {

    override fun findAll(): Flow<Character>

}
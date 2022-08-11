package com.turbo.handler

import com.turbo.model.Character
import com.turbo.repository.CharacterRepository
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.*
import java.net.URI

@Component
class CharacterHandler(
    private val repository: CharacterRepository,
) {

    suspend fun getCharacter(request: ServerRequest): ServerResponse {
        val id = request.pathVariable("id").toLong()
        val character = repository.findById(id)
        return when {
            character != null -> {
                ServerResponse
                    .ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .bodyValueAndAwait(character)
            }

            else -> ServerResponse
                .notFound()
                .buildAndAwait()
        }
    }

    suspend fun getCharacters(request: ServerRequest): ServerResponse {
        return ServerResponse
            .ok()
            .contentType(MediaType.APPLICATION_JSON)
            .bodyAndAwait(repository.findAll())
    }

    suspend fun createCharacter(request: ServerRequest): ServerResponse {
        val data = request.awaitBody(Character::class)
        val character = repository.save(data)

        return ServerResponse
            .created(URI.create("/api/characters/${character.id}"))
            .contentType(MediaType.APPLICATION_JSON)
            .buildAndAwait()
    }
}

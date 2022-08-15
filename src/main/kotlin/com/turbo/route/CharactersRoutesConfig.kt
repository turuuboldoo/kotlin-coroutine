package com.turbo.route

import com.turbo.handler.CharacterHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.coRouter

@Configuration
class CharactersRoutesConfig(
    private val handler: CharacterHandler
) {

    @Bean
    fun routes() = coRouter {
        GET("/", handler::getRoot)

        "/api/characters".nest {
            accept(MediaType.APPLICATION_JSON).nest {
                GET("", handler::getCharacters)
                GET("/{id}", handler::getCharacter)
                POST("", handler::createCharacter)
            }
        }
    }
}

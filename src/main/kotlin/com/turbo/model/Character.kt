package com.turbo.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table("characters")
data class Character(

    @Id
    val id: Long? = null,

    @Column
    val firstName: String,

    @Column
    val lastName: String

)

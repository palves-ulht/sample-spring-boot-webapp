package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class User(
        @Id @GeneratedValue
        val id: Long = 0,
        var name: String,
        var age: Int)

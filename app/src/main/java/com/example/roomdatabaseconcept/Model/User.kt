package com.example.roomdatabaseconcept.Model

import androidx.room.Entity
import androidx.room.PrimaryKey

// table for room database
@Entity(tableName = "user_table")
data class User (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val firstName: String,
    val lastName: String,
    val age: Int
)
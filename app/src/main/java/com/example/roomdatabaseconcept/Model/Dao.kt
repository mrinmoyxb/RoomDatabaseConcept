package com.example.roomdatabaseconcept.Model

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.roomdatabase.Model.User
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(user: User)

    @Query("DELETE FROM user WHERE id = :id")
    suspend fun deleteUser(id: Int)

    @Query("SELECT *FROM user")
    fun getAllUsers(): Flow<List<User>>

    @Query("SELECT *FROM user WHERE designation = 'developer'")
    fun getAllUsersByDeveloper(): Flow<List<User>>
}
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

    @Delete
    suspend fun deleteUser(user: User)

    @Query("SELECT *FROM user")
    fun getAllUsers(): Flow<List<User>>

    @Query("SELECT *FROM user WHERE designation = :designation")
    fun getAllUsersByDesignation(designation: String): Flow<List<User>>
}
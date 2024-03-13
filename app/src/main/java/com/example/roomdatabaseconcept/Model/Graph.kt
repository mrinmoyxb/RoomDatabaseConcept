package com.example.roomdatabaseconcept.Model

import android.content.Context

object Graph {
    lateinit var db: UserDatabase
        private set

    val repository by lazy{
        UserRepository(
            userDao = db.userDao()
        )
    }

    fun provide(context: Context){
        db = UserDatabase.getDatabase(context)
    }
}
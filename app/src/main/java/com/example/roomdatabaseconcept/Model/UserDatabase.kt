package com.example.roomdatabaseconcept.Model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [User::class], version=1, exportSchema = true)
abstract class UserDatabase: RoomDatabase() {
    abstract fun userDao(): UserDao
    companion object{

        // @Volatile  =
        // It indicates that the value of this variable can be modified by different threads concurrently.
        // This is important because database access can involve multiple threads, and we need to ensure safe updates to the INSTANCE variable.
        @Volatile
        private var INSTANCE: UserDatabase? = null
        //  The question mark (?) after the type indicates it can be null. This variable will hold the single instance of the UserDatabase object.

        fun getDatabase(context: Context): UserDatabase{
            // getDatabase that takes a Context parameter. This function is responsible for retrieving the UserDatabase instance.
            val tempInstance = INSTANCE

            if(tempInstance!=null){
                return tempInstance
            }
            // This is a check to see if the INSTANCE already has a value. If it does (not null), the existing instance is returned directly.
            // This avoids unnecessary database creation if it already exists.

            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,

                   // This ensures that only one thread can modify the INSTANCE variable at a time, preventing race conditions.
                    UserDatabase::class.java,
                    "user_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}
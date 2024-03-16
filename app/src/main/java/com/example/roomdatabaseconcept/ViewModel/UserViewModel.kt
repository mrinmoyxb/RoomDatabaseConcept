package com.example.roomdatabaseconcept.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.roomdatabase.Model.User
import com.example.roomdatabaseconcept.Model.UserDao
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class MainViewModel(private val userDao: UserDao) : ViewModel() {

    fun saveUser(name: String, age: Int, designation: String) {
        viewModelScope.launch {
            userDao.insertUser(User(0, name, age, designation))
        }
    }

    var getUsers: Flow<List<User>> = userDao.getAllUsers()

    var getUsersByDesignation: Flow<List<User>>  = userDao.getAllUsersByDeveloper()

    fun deleteUSer(id: Int){
        viewModelScope.launch{
            userDao.deleteUser(id)
        }
    }

}
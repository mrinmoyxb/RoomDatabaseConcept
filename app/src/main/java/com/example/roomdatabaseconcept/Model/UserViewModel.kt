package com.example.roomdatabaseconcept.Model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

//class UserViewModel(application: Application):  AndroidViewModel(application){
//    private val repository: UserRepository
//    val readAllData: LiveData<List<User>>
//
//    init{
//        val userDao = UserDatabase.getDatabase(application).userDao()
//        repository = UserRepository(userDao)
//        readAllData = repository.readAllData
//    }
//
//    fun addUser(user: User){
//        viewModelScope.launch(Dispatchers.IO){
//            repository.addUser(user)
//        }
//    }
//
//}

class UserViewModel(private val userRepository: UserRepository) : ViewModel() {
    val userList: MutableStateFlow<List<User>> = userRepository.readAllData
    val _userList: StateFlow<List<User>> = userList

    init {
        viewModelScope.launch {
            userRepository.readAllData.collect { users ->
                userList.value = users
            }
        }
    }

    fun addUser(firstName: String, lastName: String, age: Int) {
        viewModelScope.launch {
            userRepository.addUser(User(0, firstName, lastName, age))
        }
    }

}
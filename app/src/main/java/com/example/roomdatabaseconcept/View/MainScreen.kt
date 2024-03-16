package com.example.roomdatabase.View

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.roomdatabaseconcept.Model.AppDatabase
import com.example.roomdatabaseconcept.View.DesignationList
import com.example.roomdatabaseconcept.View.UserInput
import com.example.roomdatabaseconcept.View.UserList
import com.example.roomdatabaseconcept.ViewModel.MainViewModel

@Composable
fun MainScreen() {
    val context = LocalContext.current
    val viewModel = MainViewModel(AppDatabase.getInstance(context).userDao())
    val userList = viewModel.getUsers.collectAsState(emptyList())
    val userListOfDevelopers = viewModel.getUsersByDesignation.collectAsState(emptyList())

    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        item{
            UserInput(viewModel = viewModel)
            UserList(userList = userList.value)
            DesignationList(userList = userListOfDevelopers.value)
        }
    
    }
}

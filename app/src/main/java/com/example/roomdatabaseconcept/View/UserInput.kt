package com.example.roomdatabaseconcept.View

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.roomdatabaseconcept.ViewModel.MainViewModel


@Composable
fun UserInput(viewModel: MainViewModel) {

    var name by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }
    var designation by remember { mutableStateOf("")}

    Column{
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Name") }
        )

        OutlinedTextField(
            value = age,
            onValueChange = { age = it },
            label = { Text("Age") }
        )

        OutlinedTextField(
            value = designation,
            onValueChange = { designation = it },
            label = { Text("Designation") }
        )
    }
    Spacer(modifier = Modifier.height(20.dp))
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
        Button(onClick = { viewModel.saveUser(name, age.toInt(), designation)
            name = ""
            age = ""
            designation = ""
        }) {
            Text("Save User")
        }
    }
}



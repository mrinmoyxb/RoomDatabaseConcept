package com.example.roomdatabaseconcept.View

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.roomdatabaseconcept.Model.User
import com.example.roomdatabaseconcept.Model.UserViewModel
import com.example.roomdatabaseconcept.View.Components.CustomTextField

//@Preview(showBackground = true)
@Composable
fun NewScreen(viewModel: UserViewModel){
    var firstName by remember{ mutableStateOf("") }
    var lastName by remember{ mutableStateOf("") }
    var age by remember{ mutableStateOf(0) }
    var id: Int = 0

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Spacer(modifier = Modifier.height(30.dp))

        TextField(value = firstName, onValueChange = {firstName = it},
            placeholder = {Text("Enter your first name: ", fontSize = 18.sp, color = Color.Black)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(value = lastName, onValueChange = {lastName = it},
            placeholder = {Text("Enter your last name: ", fontSize = 18.sp, color = Color.Black)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(value = age.toString(), onValueChange = {age = it.toInt()},
            placeholder = {Text("Enter your age: ", fontSize = 18.sp, color = Color.Black)}
        )

        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {
            val user = User(id, firstName = firstName, lastName = lastName, age = age)
            viewModel.addUser(user)
            firstName = ""
            lastName = ""
            age = 0
        }

        ) {
            Text("Add element")
        }
    }
}
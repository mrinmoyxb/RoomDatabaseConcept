package com.example.roomdatabaseconcept.View

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.roomdatabase.Model.User
import com.example.roomdatabaseconcept.ViewModel.MainViewModel

@Composable
fun DesignationList(userList: List<User>, viewModel: MainViewModel) {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
        Text("Developers List", fontSize = 20.sp, color = Color.Black, textAlign = TextAlign.Left, fontWeight = FontWeight.Medium)
    }

    Column {
        userList.forEach { user ->
            Card(
                modifier = Modifier.fillMaxWidth()
                    .height(120.dp).background(Color.Transparent)
            ) {
                Box(
                    modifier = Modifier.fillMaxSize().background(Color.Blue).padding(10.dp)
                ) {
                    Column(modifier = Modifier.fillMaxSize()) {
                        Icon(imageVector = Icons.Filled.Delete, contentDescription = "delete",
                            modifier = Modifier.clickable {viewModel.deleteUSer(user.id)}, tint = Color.White)
                        Text(text = "Name: ${user.name}", fontWeight = FontWeight.Medium, color = Color.White, fontSize = 20.sp)
                        Text(text = "Age: ${user.age}", fontWeight = FontWeight.Medium, color = Color.White, fontSize = 20.sp)
                        Text(text = "Age: ${user.designation}", fontWeight = FontWeight.Medium, color = Color.White, fontSize = 20.sp)
                    }
                }
            }
            Spacer(modifier = Modifier.height(5.dp))
        }
    }
}
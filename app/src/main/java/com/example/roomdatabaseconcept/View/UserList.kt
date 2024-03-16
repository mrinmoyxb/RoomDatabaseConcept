package com.example.roomdatabase.View

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.roomdatabase.Model.User

@Composable
fun UserList(userList: List<User>) {
    Column {
        Text("Users:")
        userList.forEach { user ->
            Card(
                modifier = Modifier.fillMaxWidth()
                    .height(100.dp).background(Color.Transparent)
            ) {
                Box(
                    modifier = Modifier.fillMaxSize().background(Color.Black).padding(10.dp)
                ) {
                    Column(modifier = Modifier.fillMaxSize()) {
                        Text(text = "Name: ${user.name}", fontWeight = FontWeight.Medium, color = Color.White, fontSize = 20.sp)
                        Text(text = "Age: ${user.age}", fontWeight = FontWeight.Medium, color = Color.White, fontSize = 20.sp)
                    }
                }
            }
            Spacer(modifier = Modifier.height(5.dp))
        }
    }
}
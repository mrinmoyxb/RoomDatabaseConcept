package com.example.roomdatabaseconcept.View.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.roomdatabaseconcept.Model.User
import com.example.roomdatabaseconcept.Model.UserEvents
import com.example.roomdatabaseconcept.Model.UserState

@Composable
fun DisplayCard(users: List<User>){
    users.forEach { user ->
        Card(modifier = Modifier
            .fillMaxWidth()
            .background(Color.Transparent)
            .height(160.dp),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(Color.Black)
        ) {
            Column(modifier = Modifier.padding(10.dp)) {
                Text(user.id.toString(), fontSize = 25.sp, color = Color.White)
                Text(user.firstName, fontSize = 25.sp, color = Color.White)
                Text(user.lastName, fontSize = 25.sp, color = Color.White)
                Text(user.age.toString(), fontSize = 25.sp, color = Color.White)
            }
        }
    }

}
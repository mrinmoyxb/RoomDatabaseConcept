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

@Composable
fun DisplayCard(id: Int, firstName: String, lastName: String, age: String){
    Card(modifier = Modifier
        .fillMaxWidth()
        .background(Color.Transparent)
        .height(160.dp),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(Color.Black)
    ) {
        Column(modifier = Modifier.padding(10.dp)) {
            Text("Id: $id", fontSize = 25.sp, color = Color.White)
            Text(firstName, fontSize = 25.sp, color = Color.White)
            Text(lastName, fontSize = 25.sp, color = Color.White)
            Text(age, fontSize = 25.sp, color = Color.White)
        }
    }
}
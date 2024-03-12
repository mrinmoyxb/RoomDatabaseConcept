package com.example.roomdatabaseconcept.View.Components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController

@Composable
fun CustomFloatingButton(navHostController: NavHostController){
    FloatingActionButton(onClick = { navHostController.navigate("new screen") }, shape = CircleShape,
        containerColor = Color(0xFF000000)
    ) {
        Icon(imageVector = Icons.Filled.Add, contentDescription = "new screen",
            tint = Color.White)
    }
}
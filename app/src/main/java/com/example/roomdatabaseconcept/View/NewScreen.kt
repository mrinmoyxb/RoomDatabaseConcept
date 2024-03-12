package com.example.roomdatabaseconcept.View

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.roomdatabaseconcept.View.Components.CustomTextField

@Preview(showBackground = true)
@Composable
fun NewScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Spacer(modifier = Modifier.height(30.dp))
        CustomTextField(placeholder = "Enter first name")
        Spacer(modifier = Modifier.height(10.dp))
        CustomTextField(placeholder = "Enter last name")
        Spacer(modifier = Modifier.height(10.dp))
        CustomTextField(placeholder = "Enter age")
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {}) {
            Text("Update element")
        }
    }
}
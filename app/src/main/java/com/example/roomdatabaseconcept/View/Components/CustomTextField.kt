package com.example.roomdatabaseconcept.View.Components

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun CustomTextField(placeholder: String){
    var textFieldValue by remember{ mutableStateOf("")}
    TextField(value = textFieldValue, onValueChange = {textFieldValue = it},
        placeholder = {Text(placeholder, fontSize = 18.sp, color = Color.Black)}
    )
}
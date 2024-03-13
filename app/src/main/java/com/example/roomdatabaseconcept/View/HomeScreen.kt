package com.example.roomdatabaseconcept.View

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.asFlow
import androidx.navigation.NavHostController
import com.example.roomdatabaseconcept.Model.UserViewModel
import com.example.roomdatabaseconcept.View.Components.CustomAppBar
import com.example.roomdatabaseconcept.View.Components.CustomFloatingButton
import com.example.roomdatabaseconcept.View.Components.DisplayCard

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navHostController: NavHostController, viewModel: UserViewModel){

    val allUsers by viewModel.readAllData.asFlow().collectAsState(initial = emptyList())

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .background(Color(0xFFEEEEEE))
    ){
        Scaffold(topBar = {CustomAppBar()}, floatingActionButton = {CustomFloatingButton(navHostController)},
            modifier = Modifier.navigationBarsPadding()) {
            Column(
                modifier = Modifier.fillMaxSize()
            ){
                Spacer(modifier = Modifier.height(70.dp))
                DisplayCard(allUsers)
            }

        }
    }
}




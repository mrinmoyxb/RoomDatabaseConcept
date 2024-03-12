package com.example.roomdatabaseconcept

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.roomdatabaseconcept.View.HomeScreen
import com.example.roomdatabaseconcept.View.NewScreen

@Composable
fun MainScreen(){
    val navHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = "home screen"){
        composable(route = "home screen"){
            HomeScreen(navHostController)
        }
        composable(route = "new screen"){
            NewScreen()
        }
    }
}
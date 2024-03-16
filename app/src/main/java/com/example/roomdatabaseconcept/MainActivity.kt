package com.example.roomdatabaseconcept

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.roomdatabase.View.MainScreen
import com.example.roomdatabaseconcept.ui.theme.RoomDatabaseConceptTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            RoomDatabaseConceptTheme {
                MainScreen()
            }
        }
    }
}


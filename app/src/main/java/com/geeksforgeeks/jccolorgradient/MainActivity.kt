package com.geeksforgeeks.jccolorgradient

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            // Creating a Simple Scaffold Layout for the application
            Scaffold(

                // Creating a Top Bar
                topBar = { TopAppBar(title = { Text("GFG | Gradient Color Example", color = Color.White) }, backgroundColor = Color(0xff0f9d58)) },

                // Creating Content
                content = {

                    // Creating a Column Layout
                    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

                        // Declaring 2 Colors
                        val colorGreen = Color.Green
                        val colorRed = Color.Red

                        // Creating a Horizontal Gradient Color
                        val gradientGreenRed = Brush.horizontalGradient(0f to colorGreen, 1000f to colorRed)

                        // Creating a sample Row and setting is background with above Gradient Color
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .height(100.dp)
                                .background(gradientGreenRed)) {
                            Text(text = "Horizontal Gradient Green to Red", fontSize = 20.sp)
                        }

                        // Adding a Space of height 100dp
                        Spacer(modifier = Modifier.height(100.dp))

                        // Declaring 2 Colors
                        val colorGray = Color.Gray
                        val colorWhite = Color.White

                        // Creating a Vertical Gradient Color
                        val gradientGrayWhite = Brush.verticalGradient(0f to colorGray, 1000f to colorWhite)

                        // Creating a sample Row and setting is background with above Gradient Color
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .height(100.dp)
                                .background(gradientGrayWhite)) {
                            Text(text = "Vertical Gradient Gray to White", fontSize = 20.sp)
                        }

                    }
                }
            )
        }
    }
}
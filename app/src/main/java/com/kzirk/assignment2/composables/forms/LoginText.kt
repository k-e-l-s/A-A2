package com.kzirk.assignment2.composables.forms

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.kzirk.assignment2.R
import com.kzirk.assignment2.composables.Logo
import com.kzirk.assignment2.composables.backgrounds.loginBackground
import com.kzirk.assignment2.ui.theme.Assignment2Theme
import com.kzirk.assignment2.ui.theme.fontColor
import com.kzirk.assignment2.ui.theme.gold


@Composable
fun loginText(navController: NavController){
    //setting a variable that can hold the email and password values
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Assignment2Theme() {
        Box(modifier = Modifier
            .fillMaxSize()
                //this lets us show our custom background
            .background(color = Color.Transparent)
        ) {
            //calling the custom background
            loginBackground()
            //containing everything in a column for more control
            Column(
                modifier = Modifier
                        //giving everythig a padding of 40 dp and aligning everything to the center
                    .padding(40.dp)
                    .align(alignment = Alignment.Center)
            ) {
                //showing the logo
                Logo()
                TextField(modifier = Modifier
                    .background(Color.Transparent)
                    .padding(20.dp)
                    .border(width = 1.dp, color = gold)
                    .height(50.dp),
                    placeholder = { Text(text = "YOUR EMAIL", color = fontColor) },
                    value = email,
                    onValueChange = {
                        email = it
                    }
                )

                TextField(modifier = Modifier
                    .background(Color.Transparent)
                    .padding(20.dp)
                    .border(width = 1.dp, color = gold)
                    .height(50.dp),
                    placeholder = { Text(text = "PASSWORD", color = fontColor) },
                    value = password, onValueChange = {
                        password = it
                    }
                )
                Text(modifier = Modifier
                    //this lets us take the user to the sign in screen
                    .clickable { navController.navigate("SignUpScreen")}
                    //fixing the alignment and padding so it aligns properly with the end of the lines
                    .padding(end = 20.dp)
                    .align(Alignment.End),
                    text = "Don't have an account? Sign Up!",
                    color = fontColor,
                    fontSize = 12.sp
                )

                Image(
                    painter = painterResource(id = R.drawable.login),
                    contentDescription = "login",
                    modifier = Modifier
                        .weight(0.2f)
                        .width(100.dp)
                        .height(50.dp)
                        .align(alignment = Alignment.CenterHorizontally)
                        .padding(bottom = 200.dp)
                        //once we have what we need, we will go to the 'how to play' screen
                        .clickable { navController.navigate("HowToPlayScreen") }
                )
            }

        }
    }
}


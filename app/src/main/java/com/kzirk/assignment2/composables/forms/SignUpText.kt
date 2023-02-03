package com.kzirk.assignment2.composables.forms

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*

import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.kzirk.assignment2.R
import com.kzirk.assignment2.composables.backgrounds.signUpBackground
import com.kzirk.assignment2.ui.theme.Assignment2Theme
import com.kzirk.assignment2.ui.theme.fontColor
import com.kzirk.assignment2.ui.theme.gold

@Composable
fun signUpText(navController: NavController) {
    //setting a variable that can hold the email and password values
    var email by remember {
        mutableStateOf("")
    }
    var verifyEmail by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    var verifyPassword by remember {
        mutableStateOf("")
    }

    Assignment2Theme() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Transparent)
        ) {
            //using the sign up background
            signUpBackground()
            Column(
                modifier = Modifier
                    .padding(40.dp)

            ) {
                //showing the yugioh logo
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "logo",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(240.dp)
                        .padding(start = 60.dp, end = 60.dp, top = 100.dp, bottom = 0.dp)
                )
                //text fields for the form
                TextField(modifier = Modifier
                    .background(Color.Transparent)
                    .padding(vertical = 10.dp, horizontal = 20.dp)
                    .border(width = 1.dp, color = gold)
                    .height(50.dp),
                    placeholder = { Text(text = "YOUR EMAIL", color = fontColor) },
                    colors = TextFieldDefaults.textFieldColors(textColor = fontColor),
                    value = email,
                    onValueChange = {
                        email = it
                    }
                )
                TextField(modifier = Modifier
                    .background(Color.Transparent)
                    .padding(vertical = 10.dp, horizontal = 20.dp)
                    .border(width = 1.dp, color = gold)
                    .height(50.dp),

                    placeholder = { Text(text = "VERIFY EMAIL", color = fontColor) },
                    value = verifyEmail,
                    // https://stackoverflow.com/questions/66119935/how-to-override-the-text-color-in-textfield-in-jetpack-compose-using-materialthe
                    colors = TextFieldDefaults.textFieldColors(textColor = fontColor),
                    onValueChange = {
                        verifyEmail = it
                    }
                )
                TextField(modifier = Modifier
                    .background(Color.Transparent)
                    .padding(vertical = 10.dp, horizontal = 20.dp)
                    .border(width = 1.dp, color = gold)
                    .height(50.dp),

                    placeholder = { Text(text = "PASSWORD", color = fontColor) },
                    colors = TextFieldDefaults.textFieldColors(textColor = fontColor),
                    value = password, onValueChange = {
                        password = it
                    }
                )
                TextField(modifier = Modifier
                    .background(Color.Transparent)
                    .padding(vertical = 10.dp, horizontal = 20.dp)
                    .border(width = 1.dp, color = gold)
                    .height(50.dp),

                    placeholder = { Text(text = "VERIFY PASSWORD", color = fontColor) },
                    colors = TextFieldDefaults.textFieldColors(textColor = fontColor),
                    value = verifyPassword, onValueChange = {
                        verifyPassword = it
                    }
                )
                //sign up button
                Row(modifier = Modifier
                    .align(CenterHorizontally)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.signup),
                        contentDescription = "Sign Up",
                        modifier = Modifier
                                //if we click on the login button, the navigation will take us to the proper screen
                            .clickable { navController.navigate("LogInScreen")}
                            .size(width = 150.dp, height = 175.dp)
                    )
                }


            }
        }

    }
}
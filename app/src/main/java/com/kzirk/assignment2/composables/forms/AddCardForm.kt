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
import com.kzirk.assignment2.R
import com.kzirk.assignment2.composables.backgrounds.mainBackground
import com.kzirk.assignment2.composables.backgrounds.signUpBackground
import com.kzirk.assignment2.ui.theme.Assignment2Theme
import com.kzirk.assignment2.ui.theme.fontColor
import com.kzirk.assignment2.ui.theme.gold

@Composable
fun addCardForm(){

    var cardName by remember {
        mutableStateOf("")
    }
    var cardType by remember {
        mutableStateOf("")
    }
    var cardSerialNumber by remember {
        mutableStateOf("")
    }


    mainBackground()

    Assignment2Theme() {

        Column(
            modifier = Modifier
                .padding(horizontal = 40.dp, vertical = 0.dp)
        ) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)){
                Image(painter = painterResource(id = R.drawable.uploadtext),
                    contentDescription = "How to play title",
                    modifier = Modifier
                        .padding(50.dp)
                        .fillMaxWidth()
                        .height(30.dp)

                )
            }
            Row(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .height(200.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.addimage),
                    contentDescription = "add image",
                modifier = Modifier.fillMaxSize())
            }
            Row(modifier = Modifier.padding(top = 20.dp)){
                TextField(modifier = Modifier
                    .background(Color.Transparent)
                    .padding(15.dp)
                    .border(width = 1.dp, color = gold)
                    .height(50.dp),
                    placeholder = { Text(text = "CARD NAME", color = fontColor) },
                    value = cardName,
                    onValueChange = {
                        cardName = it
                    }
                )
            }
            Row(){
                TextField(modifier = Modifier
                    .background(Color.Transparent)
                    .padding(15.dp)
                    .border(width = 1.dp, color = gold)
                    .height(50.dp),
                    placeholder = { Text(text = "CARD TYPE", color = fontColor) },
                    value = cardType,
                    onValueChange = {
                        cardType = it
                    }
                )
            }
            Row(){
                TextField(modifier = Modifier
                    .background(Color.Transparent)
                    .padding(15.dp)
                    .border(width = 1.dp, color = gold)
                    .height(50.dp),
                    placeholder = { Text(text = "CARD SERIAL NUMBER", color = fontColor) },
                    value = cardSerialNumber,
                    onValueChange = {
                        cardSerialNumber = it
                    }
                )
            }
            Row(modifier = Modifier
                .align(Alignment.CenterHorizontally)
            ){
                Image(
                    painter = painterResource(id = R.drawable.uploadbutton),
                    contentDescription = "Upload",
                    modifier = Modifier
                        .size(width = 125.dp, height = 100.dp)
                )
            }
        }
    }
}
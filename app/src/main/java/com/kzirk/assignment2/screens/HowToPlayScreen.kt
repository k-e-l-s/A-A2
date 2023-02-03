package com.kzirk.assignment2.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.navigation.NavController
import com.kzirk.assignment2.R
import com.kzirk.assignment2.composables.backgrounds.mainBackground
import com.kzirk.assignment2.ui.theme.fontColor
import com.kzirk.assignment2.ui.theme.fonts

@Composable
fun howToPlayScreen(navController: NavController){
    //showing the main background
    mainBackground()
    Column(modifier = Modifier
        .padding(40.dp)
            //letting us scroll to see all the cards
        .verticalScroll(rememberScrollState()),
    ) {
        //how to play title image
        Row(modifier = Modifier.fillMaxWidth()){
            Image(painter = painterResource(id = R.drawable.howtoplaytitle),
                contentDescription = "How to play title",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
            )
        }
        //first picture to be displayed
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .align(Alignment.CenterHorizontally)
        ){
            Image(
                painter = painterResource(id = R.drawable.h2p1),
                contentDescription = "how to play picture 1",
                modifier = Modifier
                    .width(500.dp)
                    //.padding(top = 20.dp, start = 30.dp, end = 30.dp, bottom = 20.dp)
                    .height(200.dp)
            )
        }
        //first bit of text
        Row(modifier = Modifier
            .padding(bottom = 15.dp)
            .align(Alignment.CenterHorizontally)
        ){
            Text(
                text = stringResource(R.string.HowToPlay),
                color = fontColor,
                fontFamily = fonts,
                fontSize = 4.em,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp)
                    .padding(top = 20.dp, bottom = 20.dp)
            )
        }
        //second picture
        Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
            Image(
                painter = painterResource(id = R.drawable.h2p2
                ),
                contentDescription = "Photo of card",
                modifier = Modifier
                    .width(500.dp)
                    .padding(top = 20.dp, bottom = 20.dp)
                    .height(300.dp)
            )
        }
        //adding a spacer here so the bottom of the page doesn't get cut off by the navigation
        Row(){
            Spacer(modifier = Modifier.height(100.dp))
        }
    }
}
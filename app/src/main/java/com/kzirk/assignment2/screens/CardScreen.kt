package com.kzirk.assignment2.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.kzirk.assignment2.R
import com.kzirk.assignment2.composables.backgrounds.mainBackground
import com.kzirk.assignment2.models.Card
import com.kzirk.assignment2.ui.theme.darkFontColor
import com.kzirk.assignment2.ui.theme.fontColor
import com.kzirk.assignment2.ui.theme.fonts

@Composable
fun cardScreen(card: Card, navController: NavController){

    mainBackground()

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        //for backtick and name
        Row(modifier = Modifier.padding(vertical = 30.dp)){
            Text(text = "<", color = fontColor, fontSize = 22.sp,
                modifier = Modifier
                    .clickable { navController.navigate("AllCardsScreen") }
                    .padding(end = 30.dp)
            )
            Text(text = card.name, fontFamily = fonts, color = fontColor, fontSize = 22.sp)
        }

        //image
        Row(modifier = Modifier.size(width = 200.dp, height = 300.dp)){

            Image(
                painter = painterResource(id = card.image),
                contentDescription = "image of card",
                modifier = Modifier.fillMaxSize()
            )
        }
        //serial #
        Row(horizontalArrangement = Arrangement.End,
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 75.dp)
        ){
            Text(text = card.id, fontFamily = fonts, fontSize = 12.sp, color = darkFontColor)
        }
        //card types
        Row(modifier = Modifier.padding(vertical = 20.dp)){
            var types = card.categories
            if (types[0] == "Spell Card"){
                //spell card
                Image(
                    painter = painterResource(id = R.drawable.spellcard),
                    contentDescription = "Spell card",
                    modifier = Modifier
                        .size(width = 100.dp, height = 50.dp)
                ) } else {
                //dragon card
                Image(
                    painter = painterResource(id = R.drawable.dragoncard),
                    contentDescription = "Dragon card",
                    modifier = Modifier
                        .size(width = 100.dp, height = 50.dp))

            }
            Spacer(modifier = Modifier.width(40.dp))
            if (types[1] == "Normal"){
                //normal card
                Image(
                    painter = painterResource(id = R.drawable.normalcard),
                    contentDescription = "Normal card",
                    modifier = Modifier
                        .size(width = 100.dp, height = 50.dp))

            } else {
                //trap card
                Image(
                    painter = painterResource(id = R.drawable.trapcard),
                    contentDescription = "Trap card",
                    modifier = Modifier
                        .size(width = 100.dp, height = 50.dp))

            }
        }
        //description
        Row(){
            Text(
                text = card.description,
                color = fontColor,
                fontFamily = fonts,
                fontSize = 4.em,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding( bottom = 20.dp, start = 20.dp, end = 20.dp)
            )
        }
        //button
        Row(){
            Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.height(100.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.buybutton),
                    contentDescription = "buy button",
                    modifier = Modifier
                        .size(width = 150.dp, height = 100.dp)
                )
            }
        }
        Row(){
            Spacer(modifier = Modifier.height(100.dp))
        }
    }
}
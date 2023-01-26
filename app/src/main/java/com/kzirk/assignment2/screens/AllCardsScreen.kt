package com.kzirk.assignment2.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

import androidx.navigation.NavController
import com.kzirk.assignment2.CardRepository
import com.kzirk.assignment2.R
import com.kzirk.assignment2.composables.backgrounds.mainBackground
import com.kzirk.assignment2.composables.cardComponent

@Composable
fun allCardsScreen(navController: NavController){
    var cardRepo = CardRepository();
    mainBackground()
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.CenterHorizontally)){
            Image(painter = painterResource(id = R.drawable.cardstitle),
                contentDescription = "cards title",
                modifier = Modifier
                    .padding(50.dp)
                    .fillMaxWidth()
                    .height(30.dp)
            )
        }
        Row(){
            cardComponent(card = cardRepo.card1, navController, 0)
            cardComponent(card = cardRepo.card2, navController, 1)
        }
        Row(){
            cardComponent(card = cardRepo.card3, navController, 2)
            cardComponent(card = cardRepo.card4, navController, 3)
        }
        Row(){
            cardComponent(card = cardRepo.card5, navController, 4)
            cardComponent(card = cardRepo.card6, navController, 5)
        }
        Row(){
            Spacer(modifier = Modifier.height(100.dp))
        }
    }

}
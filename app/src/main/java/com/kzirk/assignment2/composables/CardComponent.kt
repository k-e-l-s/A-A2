package com.kzirk.assignment2.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.kzirk.assignment2.models.Card
import com.kzirk.assignment2.nav.Route
import com.kzirk.assignment2.ui.theme.fontColor
import com.kzirk.assignment2.ui.theme.fonts

@Composable
fun cardComponent(card: Card, navController: NavController, index: Int){
    Column(
        modifier = Modifier
            .width(160.dp)
            .height(250.dp)
            .padding(vertical = 15.dp, horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //showing the picture of the card
        Image(painter = painterResource(id = card.image),
            contentDescription = "Card Image",
            modifier = Modifier.width(150.dp).height(200.dp).clickable {
               navController.navigate(Route.CardScreen.route + "/${ index }")
            },
        )
        //showing the text outside of the cards
        Text(text = card.name, fontFamily = fonts, fontSize = 14.sp, color = fontColor)
    }
}
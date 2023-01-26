package com.kzirk.assignment2.composables.backgrounds

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.kzirk.assignment2.R

/*
* This is to display the proper background on the login screen,
* */
@Composable
fun loginBackground(){
    //using the given image
    Image(
        painter = painterResource(id = R.drawable.background1x1),
        contentDescription = "login screen background",
        //this is so the picture's width fills the whole screen
        contentScale = ContentScale.FillWidth,
        modifier = Modifier
            //a low z index lets us make sure everything renders ontop of the image
            .zIndex(-100f)
            //fill the maximum width we can
            .fillMaxWidth()
            //getting rid of any residual padding
            .padding(0.dp)
    )
}
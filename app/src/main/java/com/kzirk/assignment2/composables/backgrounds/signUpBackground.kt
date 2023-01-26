package com.kzirk.assignment2.composables.backgrounds

import androidx.compose.foundation.Image
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
fun signUpBackground(){
    //using the given image
    Image(
        painter = painterResource(id = R.drawable.signupbackground),
        contentDescription = null,
        contentScale = ContentScale.FillWidth,
        modifier = Modifier
            .zIndex(-100f)
            .fillMaxWidth()
            .padding(0.dp)
    )
}
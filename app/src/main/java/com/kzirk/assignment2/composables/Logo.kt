package com.kzirk.assignment2.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.kzirk.assignment2.R

/*
* This renders the logo image with the proper padding we want
* */
@Composable
fun Logo(){
    Box(
        modifier = Modifier.padding(start = 75.dp, top = 75.dp, bottom = 20.dp)
    ){
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            modifier = Modifier
                //we have this z-index set to 1 less than the background image
                .zIndex(-99f)
                .height(75.dp)
                .width(150.dp)
        )
    }
}
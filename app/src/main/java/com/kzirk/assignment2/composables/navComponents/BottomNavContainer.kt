package com.kzirk.assignment2.composables.navComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
//this holds the bottom nav with the screen
//reference to Friends Up code and https://johncodeos.com/how-to-create-bottom-navigation-bar-with-jetpack-compose/
fun bottomNavContainer(navController: NavController, pageScreen: @Composable () -> Unit) {

    //this sets the bottom nav where it needs to be
    Scaffold(
        bottomBar = { bottomNav(navController = navController) },
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Container for the screen to be displayed, we will pass in whatever screen we want to render to this
        Box {
            pageScreen()
        }
    }
}
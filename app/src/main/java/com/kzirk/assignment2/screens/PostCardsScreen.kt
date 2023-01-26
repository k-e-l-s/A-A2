package com.kzirk.assignment2.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.kzirk.assignment2.composables.forms.addCardForm

@Composable
fun postCardsScreen(navController: NavController){
    addCardForm()
}
package com.kzirk.assignment2.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.kzirk.assignment2.composables.forms.signUpText

@Composable
fun signUpScreen(navController: NavController){
    signUpText(navController)
}
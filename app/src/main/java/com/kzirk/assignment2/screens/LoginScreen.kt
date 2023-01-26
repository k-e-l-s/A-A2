package com.kzirk.assignment2.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.kzirk.assignment2.composables.forms.loginText


@Composable
fun loginScreen(navController: NavController){
    loginText(navController)
}
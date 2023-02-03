package com.kzirk.assignment2.composables.navComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.BrushPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import com.kzirk.assignment2.R
import com.kzirk.assignment2.nav.BottomNavItem


@Composable
fun bottomNav(navController: NavController){
    //reference: Friends Up project code and https://johncodeos.com/how-to-create-bottom-navigation-bar-with-jetpack-compose/

    //we will be keeping track of what page we're on
    val currentRoute = navController.currentBackStackEntry?.destination?.route

    //a list of bottom navigation items we want
    val navItems: List<BottomNavItem> = listOf(
        BottomNavItem.allCards,
        BottomNavItem.howToPlay,
        BottomNavItem.postCards
    )
    //this shows the background for the navbar
    Box(modifier = Modifier.height(60.dp)){
        Image(painter = painterResource(id = R.drawable.bottombackground),
            contentDescription = "bottom nav image",
        modifier = Modifier.fillMaxSize())
    }
    //this is the actual navbar component
    BottomNavigation(
        modifier =  Modifier.height(60.dp),
        contentColor = Color.Black,
        //we are already rendering the background we want, so we will make this background transparent
        backgroundColor = Color.Transparent
    ){
        //for everything we had in our navbar items
        navItems.forEach { navItem ->
            // is the current navigation item selected
            var selected = currentRoute?.startsWith(navItem.route) ?: false
            //changing the icon if it's selected
            var iconPath : Int = if (selected){
                navItem.icon2
            } else {
                navItem.icon
            }
            //rendering the icon we chose
            BottomNavigationItem(
                selected = selected,
                //setting the icon as an image
                icon = {
                    Image(painter = painterResource(id = iconPath), contentDescription = navItem.label, modifier = Modifier.size(35.dp))
                },
                //when clicked, it will take us to the desired page
                onClick = { navController.navigate(navItem.route) }

            )
        }
    }

}
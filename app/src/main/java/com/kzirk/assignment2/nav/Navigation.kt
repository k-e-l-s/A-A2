package com.kzirk.assignment2.nav

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.kzirk.assignment2.CardRepository
import com.kzirk.assignment2.R
import com.kzirk.assignment2.composables.navComponents.bottomNavContainer
import com.kzirk.assignment2.models.Card
import com.kzirk.assignment2.screens.*

//reference: Friends Up project code and https://johncodeos.com/how-to-create-bottom-navigation-bar-with-jetpack-compose/

class RouteArgs {
    companion object {
        const val CARD_ID = "cardID"
    }
}

sealed class Route(val route: String) {
    /**
     * these are the screens we will route to
     * @param route which page screen we will go to
     */

    // Route to the login screen
    object LoginScreen : Route("loginScreen")

    // Route to the sign up screen
    object SignUpScreen: Route("signUpScreen")

    // Route to the sign up screen
    object PostCardsScreen: Route("postCardsScreen")

    // Route to the sign up screen
    object AllCardsScreen: Route("allCardsScreen")

    // Route to the sign up screen
    object HowToPlayScreen: Route("howToPlayScreen")

    // Route to dynamic card screen
    object CardScreen: Route("cardScreen")

}

/**
 * bottom nav items
 * @param label - what screen I will navigate to
 * @param icon - which icon I will be using
 * @param route - the route to the screen we want
 */
sealed class BottomNavItem(var label: String, var icon: Int, var icon2: Int, var route: String) {
    //this routes us to the 'all clothes' main screen
    object allCards : BottomNavItem("all cards", R.drawable.nav1, R.drawable.nav1_filled, Route.AllCardsScreen.route)

    // this routes us to our wishlist
    object howToPlay : BottomNavItem("how to play", R.drawable.nav2, R.drawable.nav2_filled, Route.HowToPlayScreen.route)

    // this routes us to the page to post our clothes
    object postCards : BottomNavItem("post cards", R.drawable.nav3, R.drawable.nav3_filled, Route.PostCardsScreen.route)
}

@Composable
fun Navigation(){
    //creating a navigation controller we can use to actually do the navigation
    val navController = rememberNavController()


    val startingScreen: String = Route.LoginScreen.route

    NavHost(
        navController = navController,
        startDestination = startingScreen
    ) {
        composable(route = Route.PostCardsScreen.route){
            bottomNavContainer(navController = navController) {
                postCardsScreen(navController)

            }
        }

        composable(route = Route.AllCardsScreen.route){
            bottomNavContainer(navController = navController) {
                allCardsScreen(navController)
            }
        }
        composable(
            route = Route.CardScreen.route + "/{${ RouteArgs.CARD_ID }}",
            arguments = listOf(
                navArgument(RouteArgs.CARD_ID) {
                    type = NavType.IntType
                }
            )
        ){
                navBackStackEntry ->
            var id: Int? = null;
            val cardRepo = CardRepository();
            var card: Card = cardRepo.card1
            id = navBackStackEntry.arguments?.getInt(RouteArgs.CARD_ID)

            if (id != null){
               card = cardRepo.cardList[id]
            } else{
                card = cardRepo.cardList[5]
            }
            bottomNavContainer(navController = navController) {
                cardScreen(card = card, navController = navController)
            }

        }

        composable(route = Route.HowToPlayScreen.route){
            bottomNavContainer(navController = navController) {
                howToPlayScreen(navController)
            }
        }
        composable(route = Route.LoginScreen.route){
            loginScreen(navController = navController)
        }
        composable(route = Route.SignUpScreen.route){
            signUpScreen(navController)
        }
    }

}
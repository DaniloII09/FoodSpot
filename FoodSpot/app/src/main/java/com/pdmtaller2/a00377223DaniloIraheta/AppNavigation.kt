package com.pdmtaller2.a00377223DaniloIraheta

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pdmtaller2.a00377223DaniloIraheta.ui.screens.*

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController, startDestination = "restaurant") {
        composable("restaurant") { RestaurantListScreen(navController) }
        composable("menu/{restaurantId}") { backStackEntry ->
            val restaurantId = backStackEntry.arguments?.getString("restaurantId")?.toIntOrNull()
            if (restaurantId != null) {
                RestaurantMenuScreen(navController, restaurantId)
            }
        }
        composable("search") { SearchScreen(navController) }
        composable("order") { OrderScreen(navController) }
    }
}

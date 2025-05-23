package br.com.rafaseron.residencialdigital.navigation.graphs.home.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import br.com.rafaseron.residencialdigital.HomeScreen
import br.com.rafaseron.residencialdigital.navigation.Screens

fun NavGraphBuilder.homeScreen(navController: NavController) {
    composable(route = Screens.Home.route) {
        Scaffold { paddingValues ->
            HomeScreen(modifier = Modifier.padding(paddingValues))
        }
    }
}

fun NavController.navigateToHomeWithClearBackstack() {
    navigate(route = Screens.Home.route) {
        launchSingleTop = true
        popUpTo(0)
    }
}

fun NavController.navigateToHomeScreen() {
    navigate(route = Screens.Home.route) {
        launchSingleTop = true
    }
}

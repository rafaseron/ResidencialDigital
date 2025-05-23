package br.com.rafaseron.residencialdigital.navigation.graphs.home

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import br.com.rafaseron.residencialdigital.navigation.Graph
import br.com.rafaseron.residencialdigital.navigation.Screens
import br.com.rafaseron.residencialdigital.navigation.graphs.home.screens.homeScreen

fun NavGraphBuilder.homeGraph(navController: NavController) {
    navigation(startDestination = Screens.Home.route, route = Graph.HomeGraph.route) {
        homeScreen(navController)
    }
}

fun NavController.navigateToHomeGraphWithClearBackStack() {
    navigate(route = Graph.HomeGraph.route) {
        launchSingleTop = true
        popUpTo(0)
        popBackStack()
    }
}

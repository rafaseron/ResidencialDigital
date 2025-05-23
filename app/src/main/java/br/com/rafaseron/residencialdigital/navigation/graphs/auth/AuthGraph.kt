package br.com.rafaseron.residencialdigital.navigation.graphs.auth

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import br.com.rafaseron.residencialdigital.navigation.Graph
import br.com.rafaseron.residencialdigital.navigation.Screens
import br.com.rafaseron.residencialdigital.navigation.graphs.auth.screens.loginScreen

fun NavGraphBuilder.authGraph(navController: NavController) {
    navigation(startDestination = Screens.Login.route, route = Graph.AuthGraph.route) {
        loginScreen(navController)
    }
}

fun NavController.navigateToAuthGraphWithClearBackStack() {
    navigate(route = Graph.AuthGraph.route) {
        launchSingleTop = true
        popUpTo(0)
        popBackStack()
    }
}

package br.com.rafaseron.residencialdigital.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun NavHostComposable(navController: NavHostController) {
    NavHost(
        modifier = Modifier,
        navController = navController,
        startDestination = Graph.AuthGraph.route,
    ) {
        // authGraph(navController)
        // homeGraph(navController)
    }
}

fun NavController.navigateBack() {
    navigateUp()
}

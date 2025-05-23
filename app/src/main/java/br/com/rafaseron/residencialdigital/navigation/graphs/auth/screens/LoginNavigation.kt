package br.com.rafaseron.residencialdigital.navigation.graphs.auth.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import br.com.rafaseron.residencialdigital.LoginScreen
import br.com.rafaseron.residencialdigital.navigation.Screens

fun NavGraphBuilder.loginScreen(navController: NavController) {
    composable(route = Screens.Login.route) {
        Scaffold { paddingValues ->
            LoginScreen(modifier = Modifier.padding(paddingValues))
        }
    }
}

fun NavController.navigateToLoginWithClearBackstack() {
    navigate(route = Screens.Login.route) {
        launchSingleTop = true
        popUpTo(0)
    }
}

fun NavController.navigateToLoginScreen() {
    navigate(route = Screens.Login.route) {
        launchSingleTop = true
    }
}

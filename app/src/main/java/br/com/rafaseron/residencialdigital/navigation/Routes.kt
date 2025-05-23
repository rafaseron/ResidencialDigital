package br.com.rafaseron.residencialdigital.navigation

sealed class Graph(val route: String) {
    data object AuthGraph : Graph("auth_graph")
    data object HomeGraph : Graph("home_graph")
}

sealed class Screens (val route: String) {
    // AuthGraph
    data object Login : Screens("login_route")

    // HomeGraph
    data object Home : Screens("home_route")
}
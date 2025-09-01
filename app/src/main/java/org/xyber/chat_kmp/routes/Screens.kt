package org.xyber.chat_kmp.routes

sealed class Screens(val route: String) {
    object AuthRoute : Screens("auth_route")
    object HomeRoute : Screens("home_route")
}
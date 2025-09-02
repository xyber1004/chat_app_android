package org.xyber.chat_kmp.routes

import AuthViewModel
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.rpc.context.AttributeContext.Auth
import org.xyber.chat_kmp.auth.AuthView
import org.xyber.chat_kmp.home.HomeView

@Composable
fun NavigationStack() {
    val navController = rememberNavController()

    val authViewModel: AuthViewModel = AuthViewModel()
    val startDestination: String = if (authViewModel.isLoggedIn) {
        Screens.HomeRoute.route
    } else {
        Screens.AuthRoute.route
    }

    NavHost(navController = navController, startDestination = startDestination) {
        composable(Screens.AuthRoute.route) {
            AuthView(authViewModel = authViewModel, navController = navController)
        }
        composable(Screens.HomeRoute.route) {
            HomeView(authViewModel = authViewModel, navController = navController)
        }
        composable(Screens.LoginRoute.route) {
            AuthView(authViewModel = authViewModel, navController = navController)
        }
        composable(Screens.RegisterRoute.route) {
            AuthView(authViewModel = authViewModel, navController = navController)
        }
    }
}
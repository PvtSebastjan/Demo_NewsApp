package com.loc.newsapp.presentation.nvgraph

/*
import android.widget.SearchView
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.loc.newsapp.presentation.news_navigator.NewsNavigator
import com.loc.newsapp.presentation.onboarding.OnBoardingScreen
import com.loc.newsapp.presentation.onboarding.OnBoardingViewModel
import com.loc.newsapp.presentation.search.SearchScreen
import com.loc.newsapp.presentation.search.SearchViewModel

@Composable
fun NavGraph(
    startDestination: String
){
    val navController= rememberNavController()

    NavHost(navController = navController, startDestination = startDestination){
        navigation(
            route=Route.AppStartNavigation.route,
            startDestination=Route.OnBoardingScreen.route
        ){
            composable(
                route=Route.OnBoardingScreen.route
            ){
                val viewModel: OnBoardingViewModel = hiltViewModel()
                OnBoardingScreen(
                    event = viewModel::onEvent
                )
        }
    }
        navigation(
            route=Route.NewsNavigation.route,
            startDestination = Route.NewsNavigationScreen.route
        ){
            composable(route=Route.NewsNavigationScreen.route){
                NewsNavigator()
            }
        }
}



}

*/
package com.stupid.stupidandroid.ui.screen.home

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun HomeScreen(
    modifier : Modifier = Modifier,
    viewModel: HomeViewModel = hiltViewModel()
) {
    HomeScreen(
        modifier = modifier
    )
}

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
){
    Box {
        Text("Home")
    }
}
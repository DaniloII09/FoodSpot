package com.pdmtaller2.a00377223DaniloIraheta.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun BottomBar(navController: NavController) {
    NavigationBar {
        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate("restaurant") },
            label = { Text(text = "Restaurantes") },
            icon = { Icon(Icons.Default.Home, contentDescription = "restaurantes") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate("search") },
            label = { Text(text = "Buscar") },
            icon = { Icon(Icons.Default.Search, contentDescription = "buscar") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate("order") },
            label = { Text(text = "Ordenes") },
            icon = { Icon(Icons.Default.Menu, contentDescription = "ordenes") }
        )
    }
}
package com.pdmtaller2.a00377223DaniloIraheta.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.pdmtaller2.a00377223DaniloIraheta.R
import com.pdmtaller2.a00377223DaniloIraheta.models.restaurants
import com.pdmtaller2.a00377223DaniloIraheta.ui.components.BottomBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RestaurantListScreen(navController: NavController) {
    val categories = mutableListOf<String>()

    restaurants.forEach { restaurant ->
        restaurant.categories.forEach { category ->
            if (!categories.contains(category)) {
                categories.add(category)
            }
        }
    }

    Scaffold(
        bottomBar = { BottomBar(navController) },
        topBar = {
            TopAppBar(
                title = { Text(text = "FoodSpot") }
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            items(categories) { category ->
                Text(
                    text = category,
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(16.dp)
                )
                LazyRow(
                    contentPadding = PaddingValues(horizontal = 16.dp)
                ) {
                    items(restaurants) { restaurant ->
                        if (restaurant.categories.contains(category)) {
                            Card(
                                onClick = {
                                    navController.navigate("menu/${restaurant.id}")
                                },
                                modifier = Modifier
                                    .padding(end = 16.dp)
                                    .width(200.dp),
                                shape = RoundedCornerShape(16.dp),
                                elevation = CardDefaults.cardElevation(8.dp)
                            ) {
                                Column {
                                    AsyncImage(
                                        model = restaurant.imageUrl,
                                        contentDescription = restaurant.name,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .height(120.dp),
                                        placeholder = painterResource(id = R.drawable.ic_launcher_foreground),
                                        error = painterResource(id = R.drawable.ic_launcher_background)
                                    )
                                    Spacer(modifier = Modifier.height(8.dp))
                                    Text(
                                        text = restaurant.name,
                                        style = MaterialTheme.typography.titleMedium,
                                        modifier = Modifier.padding(8.dp)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

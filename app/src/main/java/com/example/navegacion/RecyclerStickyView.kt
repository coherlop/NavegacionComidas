package com.example.navegacion

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController


@Composable
fun RecyclerStickyView(navigationController: NavHostController) {

    val comidas = getComidas()

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(comidas) { comida ->
            ItemComida(comida = comida, navigationController)
        }
    }
}
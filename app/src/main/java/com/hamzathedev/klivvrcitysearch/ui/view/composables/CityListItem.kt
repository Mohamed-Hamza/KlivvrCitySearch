package com.hamzathedev.klivvrcitysearch.ui.view.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.hamzathedev.klivvrcitysearch.data.model.City

@Composable
fun CityListItem(city: City) {
    CityCard(city = city)
}

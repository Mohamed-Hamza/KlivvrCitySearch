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
    Column(modifier = Modifier.padding(8.dp)) {
        Text(text = "${city.name}, ${city.country}", style = MaterialTheme.typography.bodyLarge)
        Text(text = "${city.coord.lat}, ${city.coord.lon}", style = MaterialTheme.typography.bodyMedium)
    }
}

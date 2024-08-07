package com.hamzathedev.klivvrcitysearch.ui.view.composables

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.hamzathedev.klivvrcitysearch.data.model.City


@Composable
fun CityCard(city: City) {
    val context = LocalContext.current
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .clickable {
                val gmmIntentUri = Uri.parse("geo:${city.coord.lat},${city.coord.lon}")
                val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
                mapIntent.setPackage("com.google.android.apps.maps")
                context.startActivity(mapIntent)
            },
        elevation = CardDefaults.cardElevation(4.dp),
        shape = MaterialTheme.shapes.medium
    ) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(16.dp)) {
            Text(text = "${city.name}, ${city.country}", style = MaterialTheme.typography.bodyLarge)
            Text(text = "Coordinates: ${city.coord.lat}, ${city.coord.lon}", style = MaterialTheme.typography.bodyMedium)
        }
    }
}
package com.hamzathedev.klivvrcitysearch.ui.view.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.hamzathedev.klivvrcitysearch.ui.view.composables.CityListItem
import com.hamzathedev.klivvrcitysearch.ui.viewmodel.CityViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.hamzathedev.klivvrcitysearch.ui.view.composables.SearchBox


@Composable
fun CityListScreen(viewModel: CityViewModel = viewModel()) {
    val cities by viewModel.cities.collectAsState()
    var filter by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 32.dp, horizontal = 16.dp)
    ) {

        SearchBox(
            hint = "Search cities",
            onTextChange = {
                filter = it
                viewModel.searchCities(it)
            }
        )

        LazyColumn(modifier = Modifier.fillMaxWidth()) {
            items(cities) { city ->
                CityListItem(city)
            }
        }
    }
}
package com.hamzathedev.klivvrcitysearch.ui.view.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.hamzathedev.klivvrcitysearch.ui.view.composables.CityListItem
import com.hamzathedev.klivvrcitysearch.ui.viewmodel.CityViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun CityListScreen(viewModel: CityViewModel = viewModel()) {
    val cities by viewModel.cities.collectAsState()

    Column(modifier = Modifier.padding(16.dp)) {

        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(cities) { city ->
                CityListItem(city)
            }
        }

    }
}


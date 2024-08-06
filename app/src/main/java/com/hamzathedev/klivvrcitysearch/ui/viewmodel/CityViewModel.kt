package com.hamzathedev.klivvrcitysearch.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hamzathedev.klivvrcitysearch.data.model.City
import com.hamzathedev.klivvrcitysearch.data.repository.CityRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CityViewModel(private val repository: CityRepository) : ViewModel() {

    private val _cities = MutableStateFlow<List<City>>(emptyList())
    val cities: StateFlow<List<City>> get() = _cities

    init {
        loadCities()
    }

    private fun loadCities() {
        viewModelScope.launch {
            repository.loadCitiesFromAsset()
            _cities.value = repository.getCities()
        }
    }

}
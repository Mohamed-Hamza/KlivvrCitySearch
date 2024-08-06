package com.hamzathedev.klivvrcitysearch

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.hamzathedev.klivvrcitysearch.ui.theme.KlivvrCitySearchTheme
import com.hamzathedev.klivvrcitysearch.ui.view.screens.CityListScreen
import com.hamzathedev.klivvrcitysearch.ui.viewmodel.CityViewModel
import com.hamzathedev.klivvrcitysearch.ui.viewmodel.ViewModelFactory

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val app = application as MyApp
        val viewModelFactory = ViewModelFactory(app.cityRepository)
        val viewModel = ViewModelProvider(this, viewModelFactory).get(CityViewModel::class.java)


        setContent {
            KlivvrCitySearchTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    CityListScreen(viewModel)
                }
            }
        }
    }
}


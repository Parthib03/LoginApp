package com.example.loginappjetpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberImagePainter
import com.android.volley.toolbox.Volley
import androidx.compose.ui.platform.LocalContext

@Composable
fun SignedInScreen(viewModel: SignedInViewModel = viewModel(factory = SignedInViewModelFactory(SignedInRepository(Volley.newRequestQueue(LocalContext.current))))) {
    val apiData by viewModel.apiData.observeAsState()
    val errorMessage by viewModel.errorMessage.observeAsState()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        when {
            errorMessage != null -> {
                Text(text = errorMessage!!, color = Color.White)  // Display error message
            }
            apiData != null -> {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = rememberImagePainter(apiData!!.data.logoImage),
                        contentDescription = null,
                        modifier = Modifier.size(188.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text(text = apiData!!.data.title, color = Color.White)
                    Text(text = apiData!!.data.headline, color = Color.White)
                }
            }
            else -> {
                Text(text = "Loading...", color = Color.White)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SignedInScreenPreview() {
    SignedInScreen()
}

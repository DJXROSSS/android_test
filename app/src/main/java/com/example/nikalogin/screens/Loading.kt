package com.example.nikalogin.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.nikalogin.R

@Composable
fun LoadingScreen() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.divueens),
                contentDescription = "Divueens",
                contentScale = ContentScale.Fit,
                modifier = Modifier.align(Alignment.Center).fillMaxSize()
            )
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LoadingScreenPreview() {
    LoadingScreen()
}
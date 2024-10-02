package com.example.csc475_cta5.PhotoGalleryScreen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import coil.compose.rememberImagePainter
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PhotoGalleryScreen() {
    // Replace with your image URLs or paths to local images
    val imageUris = listOf(
        "https://runescape.wiki/w/Zamorak,_Lord_of_Chaos#/media/File:Zamorak,_Lord_of_Chaos.png"
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(3), // Adjust number of columns as needed
        contentPadding = PaddingValues(8.dp),
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(imageUris.size) { index ->
            PhotoItem(imageUrl = imageUris[index])
        }
    }
}

@Composable
fun PhotoItem(imageUrl: String) {
    Image(
        painter = rememberAsyncImagePainter(model = imageUrl),
        contentDescription = "Photo",
        modifier = Modifier
            .size(100.dp)
            .aspectRatio(1f),
        contentScale = ContentScale.Crop
    )
}

package com.example.testapplicationenvironment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun previewError() {
    LayoutErrorExample()
}

@Composable
fun LayoutErrorExample() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
            .padding(16.dp) // Error: Modifier applied after background, affecting padding appearance
    ) {
        Text("Text inside a Row", Modifier.weight(1f))
        // Error: Modifier.weight without fillMaxWidth in a Row might cause layout issues
    }
}
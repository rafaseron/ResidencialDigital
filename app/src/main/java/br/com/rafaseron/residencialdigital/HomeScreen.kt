package br.com.rafaseron.residencialdigital

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen(modifier: Modifier) {
    Column {
        Text(text = "Home")
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen(Modifier)
}

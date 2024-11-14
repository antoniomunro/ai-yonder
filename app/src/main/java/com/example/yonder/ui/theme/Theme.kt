// Theme.kt
package com.example.yonder.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColorScheme(
    primary = DarkGray,
    onPrimary = WhiteText,
    background = DarkGray,
    onBackground = WhiteText,
    surface = LightGray,
    onSurface = WhiteText
)

@Composable
fun YonderTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = DarkColorPalette,
        typography = Typography,
        shapes = MaterialTheme.shapes,
        content = content
    )
}

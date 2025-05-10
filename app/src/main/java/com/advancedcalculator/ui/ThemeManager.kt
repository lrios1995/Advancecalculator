package com.advancedcalculator.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

object ThemeManager {
    private val LightColorPalette = lightColorScheme(
        primary = Color(0xFF6200EE),
        onPrimary = Color.White,
        secondary = Color(0xFF03DAC6),
        onSecondary = Color.Black,
        background = Color(0xFFFFFFFF),
        onBackground = Color.Black,
        surface = Color(0xFFFFFFFF),
        onSurface = Color.Black
    )

    private val DarkColorPalette = darkColorScheme(
        primary = Color(0xFFBB86FC),
        onPrimary = Color.Black,
        secondary = Color(0xFF03DAC6),
        onSecondary = Color.White,
        background = Color(0xFF121212),
        onBackground = Color.White,
        surface = Color(0xFF121212),
        onSurface = Color.White
    )

    @Composable
    fun ApplyTheme(isDarkTheme: Boolean, content: @Composable () -> Unit) {
        val colors = if (isDarkTheme) DarkColorPalette else LightColorPalette
        MaterialTheme(colorScheme = colors, content = content)
    }
}
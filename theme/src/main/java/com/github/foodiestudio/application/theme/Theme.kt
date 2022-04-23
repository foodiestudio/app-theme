package com.github.foodiestudio.application.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

private val DarkColorPalette = darkColors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200
)

private val LightColorPalette = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun ApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    CompositionLocalProvider(LocalAppTypography provides appTypography) {
        MaterialTheme(
            colors = colors,
            shapes = Shapes,
            content = content
        )
    }
}

object AppTheme {
    val typography: AppTypography
        @Composable
        get() = LocalAppTypography.current
    val colors: Colors
        @Composable
        get() = MaterialTheme.colors
    val shapes: Shapes
        @Composable
        get() = MaterialTheme.shapes
}
package com.shub39.rush.core.domain.data_classes

import androidx.compose.ui.graphics.Color

data class ExtractedColors(
    val cardBackgroundDominant: Color = Color.DarkGray,
    val cardContentDominant: Color = Color.White,
    val cardBackgroundMuted: Color = Color.Gray,
    val cardContentMuted: Color = Color.White
)
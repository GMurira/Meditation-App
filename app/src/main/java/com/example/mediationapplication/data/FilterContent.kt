package com.example.mediationapplication.data

import androidx.compose.ui.graphics.Color
import com.example.mediationapplication.R


data class FilterComponent(
    val color: Color,
    val filterText: Int
)
val FILTER_CONTENT_LIST = listOf(
    FilterComponent(Color.White, R.string.text2),
    FilterComponent(Color.Green, R.string.text),
    FilterComponent(Color.Yellow, R.string.text3),
    FilterComponent(Color.Magenta, R.string.text4)
)
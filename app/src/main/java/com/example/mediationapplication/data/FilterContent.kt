package com.example.mediationapplication.data

import androidx.compose.ui.graphics.Color
import com.example.mediationapplication.R


data class FilterComponent(
    val color: Color,
    val filterText: String
)
val FILTER_CONTENT_LIST = listOf(
    FilterComponent(Color.White, "Happy"),
    FilterComponent(Color.Green, "Chilled"),
    FilterComponent(Color.Yellow, "Sombre"),
    FilterComponent(Color.Magenta, "Meditate"),
    FilterComponent(Color.Magenta, "Meditate"),
    FilterComponent(Color.Magenta, "Meditate"),
    FilterComponent(Color.Magenta, "Meditate"),
    FilterComponent(Color.Magenta, "Jeffer"),
    FilterComponent(Color.Magenta, "Just Vibes"),
    FilterComponent(Color.Magenta, "Meditate"),
)

/**
 * Mediation Type Data class
 */
data  class MediationType(
    val duration: String,
    val teacher: String,
    val title: String,
    val description: String)

val MEDIATION_TYPE_LIST = listOf(
    MediationType(
        duration = "45 mins",
        teacher = "James Madchen",
        title = "Love-Kind mediation",
        description = "During Love kindness, you focus benevolent and loving energy towards yourself and others"
    ),
    MediationType(
        duration = "34 mins",
        teacher = "Kate London",
        title = "Flower mediation",
        description = "Outdoor concentration mediation, the object is a flower"
    ),
    MediationType(
        duration = "64 mins",
        teacher = "Henry Kissinger",
        title = "Anger Managment",
        description = "Learn to act within your bounds"
    ),
    MediationType(
        duration = "34 mins",
        teacher = "Kate London",
        title = "Flower mediation",
        description = "Outdoor concentration mediation, the object is a flower"
    ),
    MediationType(
        duration = "34 mins",
        teacher = "Kate London",
        title = "Flower mediation",
        description = "Outdoor concentration mediation, the object is a flower"
    ),
    MediationType(
        duration = "45 mins",
        teacher = "James Madchen",
        title = "Love-Kind mediation",
        description = "During Love kindness, you focus benevolent and loving energy towards yourself and others"
    ),
    MediationType(
        duration = "34 mins",
        teacher = "Kate London",
        title = "Flower mediation",
        description = "Outdoor concentration mediation, the object is a flower"
    ),
    MediationType(
        duration = "64 mins",
        teacher = "Henry Kissinger",
        title = "Anger Managment",
        description = "Learn to act within your bounds"
    ),
    MediationType(
        duration = "45 mins",
        teacher = "James Madchen",
        title = "Love-Kind mediation",
        description = "During Love kindness, you focus benevolent and loving energy towards yourself and others"
    ),
    MediationType(
        duration = "34 mins",
        teacher = "Kate London",
        title = "Flower mediation",
        description = "Outdoor concentration mediation, the object is a flower"
    ),
    MediationType(
        duration = "64 mins",
        teacher = "Henry Kissinger",
        title = "Anger Managment",
        description = "Learn to act within your bounds"
    ),
    MediationType(
        duration = "45 mins",
        teacher = "James Madchen",
        title = "Love-Kind mediation",
        description = "During Love kindness, you focus benevolent and loving energy towards yourself and others"
    ),
    MediationType(
        duration = "34 mins",
        teacher = "Kate London",
        title = "Flower mediation",
        description = "Outdoor concentration mediation, the object is a flower"
    ),
    MediationType(
        duration = "64 mins",
        teacher = "Henry Kissinger",
        title = "Anger Managment",
        description = "Learn to act within your bounds"
    ),
    MediationType(
        duration = "45 mins",
        teacher = "James Madchen",
        title = "Love-Kind mediation",
        description = "During Love kindness, you focus benevolent and loving energy towards yourself and others"
    ),
    MediationType(
        duration = "34 mins",
        teacher = "Kate London",
        title = "Flower mediation",
        description = "Outdoor concentration mediation, the object is a flower"
    ),
    MediationType(
        duration = "64 mins",
        teacher = "Henry Kissinger",
        title = "Anger Managment",
        description = "Learn to act within your bounds"
    ),
)
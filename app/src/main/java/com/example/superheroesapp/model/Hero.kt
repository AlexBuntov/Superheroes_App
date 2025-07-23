package com.example.superheroesapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Hero (
    @StringRes val nameResId: Int,
    val descriptionId: Int,
    @DrawableRes val imageResId: Int,
)

package com.example.superheroesapp.model

import com.example.superheroesapp.R

object Heroes {
    val heroes = listOf<Hero>(
        Hero(
            nameResId = R.string.hero1,
            descriptionId = R.string.description1,
            imageResId = R.drawable.android_superhero1
        ),
        Hero(
            nameResId = R.string.hero2,
            descriptionId = R.string.description2,
            imageResId = R.drawable.android_superhero2
        ),
        Hero(
            nameResId = R.string.hero3,
            descriptionId = R.string.description3,
            imageResId = R.drawable.android_superhero3
        ),
        Hero(
            nameResId = R.string.hero4,
            descriptionId = R.string.description4,
            imageResId = R.drawable.android_superhero4
        ),
        Hero(
            nameResId = R.string.hero5,
            descriptionId = R.string.description5,
            imageResId = R.drawable.android_superhero5
        ),
        Hero(
            nameResId = R.string.hero6,
            descriptionId = R.string.description6,
            imageResId = R.drawable.android_superhero6
        )
    )
}
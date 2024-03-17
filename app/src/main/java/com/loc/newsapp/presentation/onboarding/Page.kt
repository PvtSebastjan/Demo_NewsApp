package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val  title:String,
    val description:String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "From the smallest towns...",
        description ="To the big cities, we deliver the news you are looking for!",
        image = R.drawable.onboarding1

    ),
    Page(
        title = "Media literacy is NOT Dead!",
        description ="Look through multiple articles, all around the world",
        image = R.drawable.onboarding2

    ),
    Page(
        title = "The House will not win",
        description ="No company or politics will be telling you a false narative",
        image = R.drawable.onboarding3

    )
)
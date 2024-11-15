package com.example.orderpizza

import java.io.Serializable

data class Pizza(
    val name: String,
    val imageResId: Int
) : Serializable

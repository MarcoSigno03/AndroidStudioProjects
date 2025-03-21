package com.example.cupcake.test

import androidx.navigation.NavController
import org.junit.Assert.assertEquals
import kotlin.math.exp

fun NavController.assertCurrentRouteName(expectedRouteName: String) {
    assertEquals(expectedRouteName, currentBackStackEntry?.destination?.route)
}
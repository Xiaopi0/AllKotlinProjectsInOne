package net.Xiaopi0.Kotlin.allKotlinProjectsInOne

import java.util.*
import net.Xiaopi0.Kotlin.allKotlinProjectsInOne.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Welcome to all Kotlin projects made by Xiaopi0.")
    println("Here is a list of them:")
    println("1. calculator")
    println("2. Person data Storage")
    println("To run a project type the number the project has on the list(without the dot)(to quit type -1).")
    val in1 = scanner.nextInt()

    if (in1 == -1) {
        println("Quitting")
    }else if (in1 == 1) {
        calculator()
    }else if (in1 == 2) {
        personData()
    }
}
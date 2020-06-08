package net.Xiaopi0.Kotlin.allKotlinProjectsInOne

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Welcome to all Kotlin projects made by Xiaopi0.")
    println("Here is a list of them:")
    println("1. test")
    println("To run a project type the number the project has on the list(without the dot).")
    val in1 = scanner.nextInt()

    if (in1 == 1) {
        Test()
    }
}

fun Test() {
    println("Hi, I'm a test.")
    println()
    main()
}
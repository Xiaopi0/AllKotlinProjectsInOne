package net.Xiaopi0.Kotlin.allKotlinProjectsInOne

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Welcome to all Kotlin projects made by Xiaopi0.")
    println("Here is a list of them:")
    println("1. calculator")
    println("To run a project type the number the project has on the list(without the dot)(to quit type -1).")
    val in1 = scanner.nextInt()

    if (in1 == -1) {
        println("Quitting")
    }else if (in1 == 1) {
        calculator1()
    }
}

fun calculator1() {
    val scanner = Scanner(System.`in`)

    var loop = true
    while (loop == true) {
        println("Write two numbers to do things with and which operator you want to use. \n? to see list of commands")
        val input_1 = scanner.next()
        //Commands
        if (input_1 == "?") {
            println("List of commands:")
            println()
            println("1. ? = view this list.")
            println("2. quit = quits the application.")
            println()
        } else if (input_1 == "quit") {
            loop = false
        } else {
            val input_2 = scanner.next()
            val output_1 = input_1.toInt()
            val output_2 = input_2.toInt()
            val operator_1 = scanner.next()
            if (operator_1 == "+") {
                println(output_1 + output_2)
                println()
            }else if (operator_1 == "-") {
                println(output_1 - output_2)
                println()
            }else if (operator_1 == "*" || operator_1 == "x") {
                println(output_1 * output_2)
                println()
            }else if (operator_1 == "/") {
                println(output_1 / output_2)
                println()
            }else if (operator_1 == "%") {
                println(output_1 % output_2)
                println()
            }else {
                println("Error: invalid operator.")
            }
        }

    }
    println()
    main()
}
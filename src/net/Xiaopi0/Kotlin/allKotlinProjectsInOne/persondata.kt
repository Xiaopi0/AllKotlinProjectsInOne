package net.Xiaopi0.Kotlin.allKotlinProjectsInOne

import java.util.*

fun personData() {
    val scanner = Scanner(System.`in`)
    while (true) {
        println("Welcome to Xiaopi0 person data storage. For help type '?'. To create a new person type 'new'.\n To look up already stored person data type 'old'")
        var in1 = scanner.next()

        if (in1 == "?") {
            help()
        }else if (in1 == "new") {
            new()
        }else if (in1 == "old") {
            old()
        }else if (in1 == "quit") {
            break
        }
    }
}

fun help() {

}

fun new() {

}

fun old() {

}
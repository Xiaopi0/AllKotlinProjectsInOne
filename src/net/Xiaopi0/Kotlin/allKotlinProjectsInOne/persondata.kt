package net.Xiaopi0.Kotlin.allKotlinProjectsInOne

import java.util.*

fun personData() {
    val scanner = Scanner(System.`in`)
    while (true) {
        println("Welcome to Xiaopi0 person data storage. For help type '?'. To create a new person type 'new'.\n To look up already stored person data type 'old'")
        val in1 = scanner.next()

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
    println("List of commands:\n 1. ? = Shows this page.\n 2. new = Creates a new person(you can store data about pesons(Name, Age etc.)).\n 3. old = shows a list of already created persons.")
    personData()
}

fun new() {

}

fun old() {

}
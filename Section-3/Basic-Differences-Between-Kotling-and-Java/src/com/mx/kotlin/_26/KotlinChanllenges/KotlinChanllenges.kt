package com.mx.kotlin._26.KotlinChanllenges

//ToDo
//1. Create a new Kotlin Project called Challenge1
//2. Add package "com.mx.challenge.1" to the project
//3. Add a file Chanllenge1 to the package
//4. Add the main function to the file

fun main(args: Array<String>) {
    //immutable String variables
    val hello1 : String = "Hello"
    val hello2 = "Hello"

    //referencial equality
    println("Hello1 refers to Hello2 ${hello1 === hello2}") //true

    //structural equality
    println("Hello1 refers to Hello2 ${hello1 == hello2}") //true

    //mutuable variable
    var num = 2988
    //immutable variable of type Any
    var some : Any = "The any type is the root of the Kotlin class hierarchy"

    if (some is String) {
        println(some.toUpperCase())
    }
}
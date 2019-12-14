package com.mx.kotlin._28.DataTypes

fun main(args: Array<String>) {
     //In Java
    //int myInt = 10;
    //long myLong = myInt

    //The last assign isn't possible in Kotlin
    var myInt = 10
    print("default datatype is ${myInt is Int}") //true
    var myLong = 22L

    //not possible
    //myLong = myInt

    //use .toLong()
    myLong = myInt.toLong()

    val  myByte : Byte = 111
    var myShort = myByte.toShort()

    val anotherInt = 5

    var myDouble = 65.984
    println(myDouble is Double) //true

    //f suffix
    val myFloat = 838.8492f
    print(myFloat is Float) //true

    //Error - Assing Double to Float
    //myDouble = myFloat Type mismatch.
    myDouble = myFloat.toDouble()

    //Char
    val char = 'b'

    //in java
    //char myChar = 65 -> A in ASCII

    //Error
    //val myChar : Char = 65

    //In Kotlin
    val myCharInt = 65
    print(myCharInt.toChar()) //A


    //Boolean
    val myBoolean = true
}
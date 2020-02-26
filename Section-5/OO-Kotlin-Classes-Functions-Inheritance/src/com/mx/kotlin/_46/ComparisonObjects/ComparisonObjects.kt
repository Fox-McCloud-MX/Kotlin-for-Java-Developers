package com.mx.kotlin._46.ComparisonObjects

fun main(args: Array<String>) {
    println(SomeClass.SomeCompanionObject.accesPrivateVar())

    val someClass1 = SomeClass.justAssing("this assing1")
    val someClass2 = SomeClass.upperOrLowerCase("this assing2", false)
    println(someClass1.someString)
    println(someClass2.someString)
}


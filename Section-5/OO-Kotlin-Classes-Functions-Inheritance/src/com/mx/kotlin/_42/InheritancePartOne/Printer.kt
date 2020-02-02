package com.mx.kotlin._42.InheritancePartOne

//Modifier 'open' is redundant because 'abstract' is present
//open operator to extend class
open abstract class Printer(val modelName: String) {

    open fun printModel() = println("the model is $modelName")
    abstract fun bestSellingPrice():Double
}

class LaserPrinter(modelName: String): Printer(modelName) {

    override fun printModel() = println("overriding model name to $modelName")
    override fun bestSellingPrice(): Double = 129.99
}
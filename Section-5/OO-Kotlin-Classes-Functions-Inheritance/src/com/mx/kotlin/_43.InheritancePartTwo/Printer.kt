package com.mx.kotlin._43.InheritancePartTwo

//Modifier 'open' is redundant because 'abstract' is present
//open operator to extend class
open abstract class Printer(val modelName: String) {

    open fun printModel() = println("the model is $modelName")
    abstract fun bestSellingPrice():Double
}

open class LaserPrinter(modelName: String, ppm: Int): Printer(modelName) {

    override fun printModel() = println("overriding model name to $modelName")
    final fun printModelFinal() = println("overriding model name to $modelName")
    override fun bestSellingPrice(): Double = 129.99
}

//call the primary constructor is needed
class SpecialLaserPrinter(modelName: String, ppm: Int) : LaserPrinter(modelName,ppm) {

    override fun printModel() = println("this is one way to override")

    //printModelFinal' in 'LaserPrinter' is final and cannot be overridden
    //override fun printModelFinal() = println("this is one way to override")

}


package com.mx.kotlin._40.ExtensionFunctions

fun main(args: Array<String>) {

    //using Utils.kt class
    println(Utils().upppreFirtsAndLast("this is lowecase"))

    //using Extension Function
    val s = "this is lowercase"
    println(s.upppreFirtsAndLast())

}

//using function as Extension Function
//change parameter with "this"
fun String.upppreFirtsAndLast() : String {
    val upperFirts = this.substring(0,1).toUpperCase() + this.substring(1)
    return  upperFirts.substring(0, upperFirts.length - 1) +
            upperFirts.substring(upperFirts.length - 1, upperFirts.length)
}
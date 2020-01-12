package com.mx.kotlin._31.NullReferences

fun main(args: Array<String>) {

    //######## Null Assertion ########
    val strNullAssertion : String? = null
    val strSafe = strNullAssertion!!.toUpperCase() //Exception in thread "main" kotlin.KotlinNullPointerException

    //######## Let Function ########

    val strLetFunction : String? = "This isn't null"
    //call printText isn't possible
    //printText(strLetFunction) //Type mismatch.  Required: String  Found: String?

    //In Java Code
    if (strLetFunction != null) {
        printText(strLetFunction)
    }

    //with Let Function
    strLetFunction?.let { printText(it) }

    //######## Null Safe Equal ########
    val strNotSafeEqual : String? = null
    val strSafeEqual = "This isn't nullable"
    println(strNotSafeEqual == strSafeEqual) //== is safe equal
}

fun printText(text : String) {
    println(text)
}
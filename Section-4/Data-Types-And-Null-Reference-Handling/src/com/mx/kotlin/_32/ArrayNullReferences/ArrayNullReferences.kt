package com.mx.kotlin._32.ArrayNullReferences

fun main(args: Array<String>) {
    val nullableInt = arrayOfNulls<Int?>(5)
    nullableInt.forEach { print(it) } //null null null null null
}
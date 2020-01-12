package com.mx.kotlin._29.Arrays

import com.mx.java.code._29.Arrays.DummyClass
import java.math.BigDecimal

fun main(args: Array<String>) {
    val names = arrayOf("John", "Jane", "Jill", "Joe")

    val longs1 = arrayOf(1L, 2L, 3L) //using L suffix
    val longs2 = arrayOf<Long>(1, 2, 3, 4)
    val longs3 = arrayOf(1, 2, 3, 4)

    println(longs1 is Array<Long>) //true
    println(longs2 is Array<Long>) //true
    println(longs3 is Array<Int>)  //true

    println(longs1[2]) //3

    val evenNumber = Array(16) { i -> i  * 2 } //Initialize with lambda

    for (number in evenNumber ) {
        print(number) // 0 2 4 6 8 10 ....
    }

    val lotsOfNumbers = Array(100000) { i -> i + 1 }
    val allZeros = Array(100) { 0 } // {i -> i = 0}

    var someArray : Array<Int>
    someArray = arrayOf(1, 2, 3, 4)

    for (number in someArray) {
        print(number) // 1 2 3 4
    }
    someArray = Array(6) { i -> (i+1) * 10 } //re size
    print(someArray) //10 20 30 40 50 60

    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')
    for (element in mixedArray) {
        print(element)
    }

    println(mixedArray is Array<Any>) //true

    val myIntArray = intArrayOf(3, 9, 439, 2, 33) //can't use arrayOf
    DummyClass().printNumbers(myIntArray)

    var someOtherArray = IntArray(5)

    val convertedIntArray = myIntArray.toTypedArray()

}
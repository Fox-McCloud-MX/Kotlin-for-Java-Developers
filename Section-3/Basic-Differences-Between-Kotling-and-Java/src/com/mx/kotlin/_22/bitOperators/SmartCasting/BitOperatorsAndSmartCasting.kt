package com.mx.kotlin._22.bitOperators.SmartCasting

import com.mx.kotlin._21.equality.Employee

fun main(args: Array<String>) {

    //bit operator
    val x = 0x00101101
    val y = 0x11011011

    //or in java x | y in kotlin | doesn't exist
    //and in java x & y in kotlin & doesn't exist

    //in kotlin
    val z = x or y
    val w = z and y
    val t = z xor y

    //casting
    val employeeOne = Employee("Mary", 1)
    val something: Any = employeeOne

    if (something !is Employee) {

    }
    else{
        val newEmployee = something as Employee //cast in kotlin
        println(newEmployee.name)
    }
}
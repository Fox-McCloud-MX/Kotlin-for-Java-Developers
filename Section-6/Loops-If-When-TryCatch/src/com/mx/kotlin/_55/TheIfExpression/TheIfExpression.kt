package com.mx.kotlin._55.TheIfExpression

fun main(args: Array<String>) {

    val someCondition = true;

    //in Kotlin the ternay operator doesn't exist
    val num = if(someCondition) 50 else 40

    val num2 = if(someCondition) {
        println("if block")
        50
    }
    else { //else block is required
        println("else block")
        40
    }

    println(num2) //50

}
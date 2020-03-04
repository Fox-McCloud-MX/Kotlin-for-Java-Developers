package com.mx.kotlin._54.TheForLoop

fun main(args: Array<String>) {

    //range variable as Int
    val range = 1..5

    //range as char or String
    var charRange = 'a'..'z'
    var stringRange = "ABD".."XYZ"

    println(3 in range)
    println('q' in charRange)
    println("CCC" in stringRange)
    println("CCCCCC" in stringRange)
    println("ZZZZ" in stringRange) //false

    //search to backward
    val backwardRange = 5.downTo(1)
    //downTo isn't equal to
    val r = 5..1

    println(5 in r) //false
    println(5 in backwardRange) //true

    //you can't use downTo in for loop statement
    //for(i in range downTo 1)

    //steps
    val stepRange = 3..15
    val stepThree = stepRange.step(3)
    val revenseRange = range.reversed()

    //you can use step directly in for loop statement
    for (i in stepRange step 3) {
        print(i) //3691215
    }

    //numeric and string ranges has diferents methods

    //loop in range
    for (i in stepThree) {
        print(i) //3691215
    }

    //you can't iterate throug string as range
    //for (i in stringRange) {} -> ERROR

    //but, string class has iterator
    val str = "Hello"
    for(i in str) {
        print(i)
    }

    //until exclude
    for(i in 1 until  10) {
        print(i) //ton print 10
    }
}
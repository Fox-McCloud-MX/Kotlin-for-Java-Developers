package com.mx.kotlin._54.TheForLoop

fun main(args: Array<String>) {
    val seasons = arrayOf("spring", "summer", "winter", "fall")

    for(season in seasons) {
        println(season)
    }

    val notASeasion = "whatever" !in seasons
    println(notASeasion) //true

    val notInRange = 32 !in 1..10
    println(notInRange) //true

    //you can use as numeric index
    for(index in seasons.indices) {
        println("${seasons[index]} is season number $index")
    }

    //using lambda expression
    seasons.forEach { println(it) }

    seasons.forEachIndexed{index, value -> println("$value is seasion number $index")}

    //nested loops with name
    firtLoop@ for (i in 1..3) {
        for (j in 3..6) {
            print(j)
            break@firtLoop
        }
        continue@firtLoop
    }
}
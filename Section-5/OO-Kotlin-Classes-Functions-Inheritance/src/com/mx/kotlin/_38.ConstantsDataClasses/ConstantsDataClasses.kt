package com.mx.kotlin._38.ConstantsDataClasses

val MY_CONSTANT: 100

fun main(args: Array<String>) {
    val car = Car("blue", "Toyota", 2015)

    println(car) //printed as object not memory reference value
    //Car(color=blue, model=Toyota, year=2015)

    //equals
    val car2 = Car("blue", "Toyota", 2015)
    println(car == car2) // true
    //false with another non data class

    val car3 = car.copy()
    println(car3) //structural equal to car

    val car4 = car.copy(year = 2016)
    println(car4) //year = 2016

}

//Primary constructor at least one argument
//They can't be abstract, sealed or inner classes 
data class Car(val color: String, val model: String, val year: Int) {

}
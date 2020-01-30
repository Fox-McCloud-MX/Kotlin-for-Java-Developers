package com.mx.kotlin._38.KotlinFunctionBasics

//defaul return vaue is Unit
fun main(args: Array<String>) : Unit {
    println(labelMultiply(3,4, "The result is: "))

    //named arguments
    println(labelMultiply( label="The result is: ",operand2 =  = 3, operand1 = 4))

    //not pass default arguments
    println(labelMultiply2(3,4))

    val emp = Employee("Jane")
    println(emp.uperrCaseFirstName())


    cal car1 = Car("blue", "Toyota", 2015)
    cal car1 = Car("red", "Ford", 2016)
    cal car1 = Car("green", "Ford", 2017)
    printColors(car1, car2, car3)

    //spread operator *
    val manyCars = arrayOf(car1, car2, car3)
    printColors(*manyCars) // can't pass the array

    //using spread operator to combine array
    val moreCars = arrayOf(car1, car2)
    val car4 = car2.copy()
    val lotsOfCars = arrayOf(*manyCars, *moreCars, car4)

}

//conventional
//can use fun without braces with non return type
fun labelMultiply(operand1 : Int, operand2: Int, label: String) {
    return ("$label ($operand1 * $operand2"))
}

//equals way (an expression body)
fun labelMultiply2(operand1 : Int, operand2: Int, label: String = "The result is: ") : String =
    "$label ($operand1 * $operand2")

//without braces infering return type as Kotlin.Int
fun plus() = 3 * 2


class Employee(val firstName: String) {
    fun uperrCaseFirstName() = firstName.toUpperCase()
}

fun printColors(vararg  cars: Car) {
    for (car in cars){
        println(car.color)
    }
}

data class Car(val color: String, val model: String, val year: Int) {

}
package com.mx.kotlin._23.stringTemplates

fun main(args: Array<String>) {
    val employee1 = Employee("Lyn Jones", 500)

    //without override .toString method
    //com.mx.kotlin._21_equality.Employee@610455d6

    //with override .toString method
    //Employee(name=Lyn Jones, id=500)

    println(employee1)

    //the dollar change ($)
    val change = 4.22
    println("To show the calue of change, we use $change")

    val numerator = 10.99
    val denominator = 20.00
    println("The value of $numerator divided by $denominator is ${numerator/denominator}")

    println("The employee0s id is ${employee1.id}")

}

class Employee(var name: String, val id: Int) {

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }
}
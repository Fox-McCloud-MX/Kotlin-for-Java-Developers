package com.mx.kotlin._21.equality

fun main(args: Array<String>) {
    val employeeOne = Employee("Mary", 1)
    val employeeTwo = Employee("John", 2)
    val employeeTrhee = Employee("John", 2)

    //referencial equiality
    println(employeeOne === employeeTwo)         //java=false | kotlin = false
    println(employeeTwo === employeeTrhee)       //java=false | kotlin = false

    println(employeeOne == employeeTwo)         //java=false | kotlin = false
    println(employeeTwo == employeeTrhee)       //java=false | kotlin = true
    println(employeeOne.equals(employeeTwo))    //java=false | kotlin = false
    employeeTwo.equals(employeeTrhee)           //java=true  | kotlin = true

    val employeeFour = employeeTwo
    println(employeeFour === employeeTwo) //true

    println(employeeFour != employeeTwo)    //false
    println(employeeFour !== employeeTwo)   //false
    println(employeeTwo != employeeTrhee)   //false
    println(employeeTwo !== employeeTrhee)  //true
}

class Employee(var name: String, val id: Int) {

    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return  name == obj.name && id == obj.id
        }
        return false
    }
}
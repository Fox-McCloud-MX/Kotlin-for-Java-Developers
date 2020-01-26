package com.mx.kotlin._36.ClassesInKotlin

fun main(args: Array<String>) {
    val employee = Employee("John")
    println(employee.firstName)

    val employee2 = Employee2("John", false)
    println(employee2.firstName)
}

//defaul constructor
class Employee constructor(firstName: String){
    val firstName : String

    init {
        this.firstName = firstName
    }
}

class Employee2 (val firstName: String) { //primary constructor
    constructor(firstName: String, fullTime: Boolean = true) : this(firstName){

    }
}

//constructor visibility
class Employee3 protected constructor(val firstName: String) {

}
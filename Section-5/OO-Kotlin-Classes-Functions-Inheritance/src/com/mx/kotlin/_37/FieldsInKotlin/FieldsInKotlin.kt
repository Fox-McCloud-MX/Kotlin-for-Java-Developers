package com.mx.kotlin._37.FieldsInKotlin

fun main(args: Array<String>) {
    val employee : Employee = Employee("John")

    //Setter and Getter have the same visibility of property
    //employee.fulltime //ERROR
}

//don't use private property
class  Employee(val firstName: String, private var fullTime: Boolean = true) {

}

class  Employee2(val firstName: String, fullTime: Boolean = true) {

    var fullTime = fullTime
    get() {
        println("Custom get")
        return field
    }

    set(value) {
        field = value
    }
}
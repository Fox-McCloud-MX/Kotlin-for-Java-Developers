package com.mx.kotlin._35.AccessModifiers

//access modifier DEFAULT visibility is public
//access modifier INTERNAL is visible inside the module


fun main(args: Array<String>) {

    val emp = Employee()
    println(emp)

}

//can use private class in the same file
private class  Employee {
    
}
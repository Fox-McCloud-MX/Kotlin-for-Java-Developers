package com.mx.kotlin._18.declarations

fun main(args: Array<String>) {
    /*  - Kotlin recoomends that you declare val whenever possible
        as good practice

        - Use val in Kotlin as final in Java

        - val = unmutable
        - var = mutable
    */

    //Declaration types
    val number = 25 //compiler assume int
    val numberInt = Int
    val numberIntAssing : Int = 25

    //val = unmutable
    val numberFinalAssing : Int
    numberFinalAssing = 10; //assign ok
    //numberFinalAssing = 20; //ERROR: Val cannot be reassigned

    //var = mutable
    var numberVarAssing : Int
    numberVarAssing = 10; //assign ok
    numberVarAssing = 20; //assing ok

    //Objects
    val employeeOne = Employee("Lynn Jones", 500);
    employeeOne.name = "Lynn Smit"

    //val employeeOne = Employee("Tim Watson", 100); //ERROR: Val cannot be reassigned
    //employeeOne.id = 10; //ERROR: Val cannot be reassigned

    //The type variable can't change
    var variableCanNotChangeType = 10;
    //variableCanNotChangeType = "10" //Type mismatch
}

class Employee(var name: String, val id: Int) {


}
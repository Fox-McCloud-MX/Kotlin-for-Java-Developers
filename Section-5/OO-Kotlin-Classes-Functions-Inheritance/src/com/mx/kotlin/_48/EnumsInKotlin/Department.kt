package com.mx.kotlin._48.EnumsInKotlin

enum class Department(val fullName: String, val numEmployees: Int) {
    HR("HumanResources",2),
    IT("Technology",10),
    ACCOUNTING("Accounting",3),
    SALES("Sales",20);

    //Semicolon is needed when declares functions in enums
    fun getDeptInfo() = "The $fullName department as $numEmployees employees"
}
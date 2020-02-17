package com.mx.kotlin._44.InterfacesInKotlin

interface MyInterface {

    //abstract property
    val number: Int

    //concrete property
    val number2: Int
        get() = 50

    fun MyFunction(string: String) : String
}

interface MySubInterface: MyInterface {
    fun mySubFunction(num: Int) : String
}
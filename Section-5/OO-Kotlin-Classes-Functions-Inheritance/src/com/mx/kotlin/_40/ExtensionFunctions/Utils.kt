package com.mx.kotlin._40.ExtensionFunctions

class Utils {

    //this funciton should be moved to ExtensionFunctions.kt
    fun upppreFirtsAndLast(str: String) : String {
        val upperFirts = str.substring(0,1).toUpperCase() + str.substring(1)
        return  upperFirts.substring(0, upperFirts.length - 1) +
                upperFirts.substring(upperFirts.length - 1, upperFirts.length)
    }

}
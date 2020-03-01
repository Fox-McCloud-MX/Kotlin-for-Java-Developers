package com.mx.kotlin._49.Imports

import com.mx.kotlin._40.ExtensionFunctions.upppreFirtsAndLast as ufal
import com.mx.kotlin._48.EnumsInKotlin.Department.IT as comp
import com.mx.kotlin._49.Imports.SomeImport.topLevel

/*
Import new module.

- Right click in module
- Modules
- Select Module
- Dependencies
- + Plus icon
- Select module dependency
- Select module to import
- OK
*/

fun main(args: Array<String>) {
    topLevel("Module File")
    print(comp.getDeptInfo())
    println("String work here ".ufal())
}

package com.mx.kotlin._46.ComparisonObjects

class SomeClass private constructor(val someString: String){
    private val privateVar = 6

    fun accesPrivateVar() {
        System.out.println("Im accesing privateVar $privateVar")
    }

    //Only one companion object is allowed per class
    companion object SomeCompanionObject{
        private  var privateVar = 6

        fun accesPrivateVar() = "Im accesing privateVar $privateVar"

        fun justAssing(str: String) = SomeClass(str)
        fun upperOrLowerCase(str: String, lowerCase: Boolean) : SomeClass{
            return if (lowerCase) {
                SomeClass(str.toLowerCase())
            }
            else {
                SomeClass(str.toLowerCase())
            }
        }

    }
}
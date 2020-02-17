package com.mx.kotlin._44.InterfacesInKotlin

class InterfacesInKotlin(override val number: Int) : MySubInterface{

    override val number2: Int = 10

    override fun mySubFunction(num: Int): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun MyFunction(string: String): String {
        TODO("not implemented yet") //To change body of created functions use File | Settings | File Templates.
    }

}
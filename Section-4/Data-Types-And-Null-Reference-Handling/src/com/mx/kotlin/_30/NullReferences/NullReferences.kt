package com.mx.kotlin._30.NullReferences

fun main(args: Array<String>) {

    //######## Safe Operator ########

    //val strNull : String = null //Null can not be a value of a non-null type String
    val strNull : String? = null //To allow assign null a variable add question mark symbol ?

    val str : String? = "This isn't null"

    //Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    //str.toUpperCase()

    //to use many function, validation null check is needed
    if (str != null) {
        str.toUpperCase() //smart compiler
    }

    //instead use
    str?.toUpperCase()

    //using null assign with safe operator ?
    println("Using strNull as null is equal to ${strNull?.toUpperCase()}") //null as string

    //safe operator can be linked
    val strLinked : String = "Linked String"
    strLinked?.toUpperCase()?.toLowerCase()?.toString()

    //######## Elvis Operator ########

    //Elvis Operator ?:
    //Use to assign when a variable is null
    var strElvis : String = str ?: "This is the default value"

    //Elvis Operator in Java
    if (str == null) {
        strElvis = "This is the default value"
    }
    else {
        strElvis = str
    }

    //######## Safe Cast Operator ########

    val objectElvis : Any = arrayOf(1, 2, 3, 4)
    val strObjElvis = objectElvis as? String
    println(strObjElvis) //null
}
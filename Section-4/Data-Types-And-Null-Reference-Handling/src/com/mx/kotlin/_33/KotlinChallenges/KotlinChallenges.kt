package com.mx.kotlin._33.KotlinChallenges

fun main(args: Array<String>) {
    //assing float
    val float1 = -3847.384f
    val float2: Float = -3847.384f //f is required
    val float3 = -3847.384.toFloat() //don't use
    val float4: Float? = -3847.384f

    //array
    val shortArray1 = shortArrayOf(1, 2, 3, 4, 5)
    val shortArray2 : Array<Short> = arrayOf(1, 2, 3, 4, 5)

    //initialize array up to 200
    val intArray = Array<Int?>(40) { (it + 1) * 5}

    //String
    val x : String? = "I AM IN UPERCASE"
    val z = x?.toLowerCase() ?: "I give up!"

    //let function
    val y : String? = "ANOTHER STRING"
    y?.let { it.toLowerCase().replace("STRING", "VAR") }

    //NOT NULL
    val myNonNullVariable : Int? = null
    myNonNullVariable!!.toDouble() //null pointer exception
}


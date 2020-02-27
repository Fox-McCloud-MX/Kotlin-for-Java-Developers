package com.mx.kotlin._47.AnonymousObjects

fun main(args: Array<String>) {
    wantsSomeInterface(object : SomeInterface {
        override fun mustImplement(num: Int): String {
            return "this is from mustImplement"
        }
    })

}

fun wantsSomeInterface(si: SomeInterface) {
    println("printing from wantSomeInterface ${si.mustImplement(22)}")
}
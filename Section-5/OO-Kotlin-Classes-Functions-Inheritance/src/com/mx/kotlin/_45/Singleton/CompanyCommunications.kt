package com.mx.kotlin._45.Singleton

import java.time.Year

object CompanyCommunications {
    val currentYeat = Year.now().value

    fun getTagLine() = "Our company rocks!"
    fun getCopyrightLine() = "CC"
}
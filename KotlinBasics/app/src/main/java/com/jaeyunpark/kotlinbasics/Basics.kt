package com.jaeyunpark.kotlinbasics

fun main(){
    // immutable variable
    // TODO: Add new functionality

    /*
    this
    is
    comment
     */

    // type string
    var myName = "Denis"
    // type int 32 bit
    // type inference finds out the type from context
    var myAge = 31
    var isSunny: Boolean = true
    isSunny = false

    // Characters
    var letterChar = 'A'

    // Strings
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length -1]

    myName = "Claudia"
    print("Last Character " + lastCharInStr)
}
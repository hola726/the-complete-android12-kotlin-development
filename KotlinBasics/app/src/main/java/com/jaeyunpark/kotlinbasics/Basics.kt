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
    print("Last Character $lastCharInStr and the length of myStr is ${myStr.length}\n")

    // Arithmetic operators
    var result = 5+3
    result *= 2
    val a = 5.0
    val b = 3
    var resultDouble : Double
    resultDouble = a / b
    println(resultDouble)

    // Comparison operators
    val isEqual = 5== 3
    println("isEqual is $isEqual")

    val isNotEqual = 5!=5
    println("isNotEqual is $isNotEqual")

    println("is5greater3 ${5>3}")
    println("is5LowerEqual3 ${5 <= 3}")
    println("in5GreaterEqual5 ${ 5 >= 5}")

    // Assignment operators
    var myNum = 5
    myNum += 3
    println("myNum is $myNum")
    myNum *=4
    println("myNum is $myNum")

    //Increment & Decrement operators
    myNum++
    println("myNum is $myNum")
    println("myNum is ${myNum++}")
    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")

    var heightPerson1 = 170
    var heightPerson2 = 189

    if(heightPerson1 > heightPerson2){
        println("user raw force")
    }else if(heightPerson1 == heightPerson2){
        println("use you power technique 1337")
    }else{
        println("use technique")
    }

    val age = 17
    if(age >= 21){
        println("now you may drink in the US")
    }else if(age >= 18){
        println("you may vote now")
    }else if(age >= 16){
        println("you may drive now")
    }else{
        println("you're too young")
    }

    val name = "Denis"

    if(name == "Denis"){
        println("Welcome home denis")
    }else{
        println("Who are you?")
    }
    var isRainy = true
    if(isRainy)
        println("It's rainy")


}
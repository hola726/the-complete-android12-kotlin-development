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

    var season = 3
    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }
    var month = 3
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        in 12..2 -> println("Winter")
        else -> println("Invalid Season")
    }

    when(age){
        in 21..150 -> println("now you may drink in the US")
        in 18..20 -> println("you may vote now")
        16,17 -> println("you may drive now")
        else -> println("you're too young")
    }

    var x : Any = 13.37f
    when(x){
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }

    var condition = 1
    while(condition <= 10){
        print("$condition ")
        condition++
    }
    println("\nwhile loop is done")

    var conditionValue = 100
    while(conditionValue >= 0){
        print("$conditionValue ")
        conditionValue -= 2
    }
    println("")
    x = 1
    do{
        print("$x ")
        x++
    }while(x <= 10)
    println("\ndo while loop is done")

    var feltTemp = "cold"
    var roomTemp = 10
    while(feltTemp =="cold"){
        roomTemp++
        if(roomTemp >= 20){
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }

    for(num in 1..10){
        print("$num ")
    }
    println()
    for(i in 1 until 10){
        print("$i ")
    }

    println()
    for(i in 10 downTo 1 step 2){
        print("$i ")
    }
    println()

    for(i in 1 until 20){

        if(i/2 == 5){
            continue
        }
        print("$i ")

    }
    print("Done with the loop")
}
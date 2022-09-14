package com.jaeyunpark.kotlinbasics

//fun main(){
//    // immutable variable
//    // TODO: Add new functionality
//
//    /*
//    this
//    is
//    comment
//     */
//
//    // type string
//    var myName = "Denis"
//    // type int 32 bit
//    // type inference finds out the type from context
//    var myAge = 31
//    var isSunny: Boolean = true
//    isSunny = false
//
//    // Characters
//    var letterChar = 'A'
//
//    // Strings
//    val myStr = "Hello World"
//    var firstCharInStr = myStr[0]
//    var lastCharInStr = myStr[myStr.length -1]
//
//    myName = "Claudia"
//    print("Last Character $lastCharInStr and the length of myStr is ${myStr.length}\n")
//
//    // Arithmetic operators
//    var result = 5+3
//    result *= 2
//    val a = 5.0
//    val b = 3
//    var resultDouble : Double
//    resultDouble = a / b
//    println(resultDouble)
//
//    // Comparison operators
//    val isEqual = 5== 3
//    println("isEqual is $isEqual")
//
//    val isNotEqual = 5!=5
//    println("isNotEqual is $isNotEqual")
//
//    println("is5greater3 ${5>3}")
//    println("is5LowerEqual3 ${5 <= 3}")
//    println("in5GreaterEqual5 ${ 5 >= 5}")
//
//    // Assignment operators
//    var myNum = 5
//    myNum += 3
//    println("myNum is $myNum")
//    myNum *=4
//    println("myNum is $myNum")
//
//    //Increment & Decrement operators
//    myNum++
//    println("myNum is $myNum")
//    println("myNum is ${myNum++}")
//    println("myNum is ${++myNum}")
//    println("myNum is ${--myNum}")
//
//    var heightPerson1 = 170
//    var heightPerson2 = 189
//
//    if(heightPerson1 > heightPerson2){
//        println("user raw force")
//    }else if(heightPerson1 == heightPerson2){
//        println("use you power technique 1337")
//    }else{
//        println("use technique")
//    }
//
//    val age = 17
//    if(age >= 21){
//        println("now you may drink in the US")
//    }else if(age >= 18){
//        println("you may vote now")
//    }else if(age >= 16){
//        println("you may drive now")
//    }else{
//        println("you're too young")
//    }
//
//    val name = "Denis"
//
//    if(name == "Denis"){
//        println("Welcome home denis")
//    }else{
//        println("Who are you?")
//    }
//    var isRainy = true
//    if(isRainy)
//        println("It's rainy")
//
//    var season = 3
//    when(season){
//        1 -> println("Spring")
//        2 -> println("Summer")
//        3 -> {
//            println("Fall")
//            println("Autumn")
//        }
//        4 -> println("Winter")
//        else -> println("Invalid Season")
//    }
//    var month = 3
//    when(month){
//        in 3..5 -> println("Spring")
//        in 6..8 -> println("Summer")
//        in 9..11 -> println("Fall")
//        in 12..2 -> println("Winter")
//        else -> println("Invalid Season")
//    }
//
//    when(age){
//        in 21..150 -> println("now you may drink in the US")
//        in 18..20 -> println("you may vote now")
//        16,17 -> println("you may drive now")
//        else -> println("you're too young")
//    }
//
//    var x : Any = 13.37f
//    when(x){
//        is Int -> println("$x is an Int")
//        !is Double -> println("$x is not a Double")
//        is String -> println("$x is a String")
//        else -> println("$x is none of the above")
//    }
//
//    var condition = 1
//    while(condition <= 10){
//        print("$condition ")
//        condition++
//    }
//    println("\nwhile loop is done")
//
//    var conditionValue = 100
//    while(conditionValue >= 0){
//        print("$conditionValue ")
//        conditionValue -= 2
//    }
//    println("")
//    x = 1
//    do{
//        print("$x ")
//        x++
//    }while(x <= 10)
//    println("\ndo while loop is done")
//
//    var feltTemp = "cold"
//    var roomTemp = 10
//    while(feltTemp =="cold"){
//        roomTemp++
//        if(roomTemp >= 20){
//            feltTemp = "comfy"
//            println("it's comfy now")
//        }
//    }
//
//    for(num in 1..10){
//        print("$num ")
//    }
//    println()
//    for(i in 1 until 10){
//        print("$i ")
//    }
//
//    println()
//    for(i in 10 downTo 1 step 2){
//        print("$i ")
//    }
//    println()
//
//    for(i in 1 until 20){
//
//        if(i/2 == 5){
//            continue
//        }
//        print("$i ")
//
//    }
//    print("Done with the loop\n")
//    myFunction()
//    myFunction()
//    var addResult = avg(5.3,13.37)
//    print("\nresult is $addResult")
//
//    var name2 :String= "Denis"
//    // name = null -> Compilation ERROR
//    var nullableName : String? = "Denis"
////    nullableName = null
//
//    var len = name2.length
//    var len2 = nullableName?.length
//    nullableName?.let {println(it.length)}
//    // ?: Elvis operator
//    val name3 = nullableName ?: "Guest"
//    println("name is $name3")
//
//    println(nullableName!!.toLowerCase())
//    /*
//    if(nullableName != null){
//        var len2 = nullableName.length
//
//    }else{
//        null
//    }
//     */
//}
//
//fun avg(a:Double, b:Double): Double{
//    return a+b /2
//}
//
//// Method - a Method is a Function within a class
//// Parameter (input)
//fun addUp(a: Int, b: Int) : Int{
//    // output
//    return a+b
//}
//
//fun myFunction(){
//    println("Called from myFunction")
//}

//fun main(){
//    myFunction(5)
//
//}
//// this a is a parameter
//fun myFunction(a:Int){
//    // a is a variable
//    var b = a
//    println("b is $b")
//}




//fun main(){
//    var denis = Person("Denis", "Panjuta", 31)
//    denis.hobby = "skateboard"
//    denis.age = 32
//    println("Denis is ${denis.age} years old")
//    denis.stateHobby()
//    var john = Person()
//    john.hobby = "play video games"
//    john.stateHobby()
//    var johnPeterson = Person(lastName = "Peterson")
//
//}

class Person(firstName: String = "John", lastName: String = "Doe"){
    // Member Variables - Properties.
    var age: Int? = null
    var hobby: String = "watch Netflix"
    var firstName: String? = null


    // Initializer Block
    init {
        this.firstName = firstName
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }
    // Member secondary Constructor
    constructor(firstName: String, lastName: String, age:Int)
            : this(firstName, lastName){
                this.age = age
            }

    // Member functions - Methods
    fun stateHobby(){

        println("$firstName\'S hobby is $hobby")
    }

}

//fun main(){
//    var myCar = Car()
//    println("brnad is : ${myCar.myBrand}")
//    myCar.maxSpeed = 200
//    println("Maxspped is ${myCar.maxSpeed}")
//    println("Model is ${myCar.myModel}")
//
//}

//class Car(){
//    lateinit var owner: String
//
//    val myBrand: String = "BMW"
//        // Custom getter
//        get() {
//            return field.toLowerCase()
//        }
//
//    var maxSpeed :Int = 250
////        get() = field
//        set(value) {
//            field = if(value > 0 ) value else throw IllegalArgumentException("Maxspeed cannot be less than 0")
//         }
//
//    var myModel : String = "M5"
//        private set
//
//    init {
//        this.myModel = "M3"
//        this.owner = "Frank"
//    }
//
//}

data class User(val id : Long, var name: String)

//fun main(){
//    val user1 = User(1, "Denis")
//
////    val name = user1.name
////    println(name)
//    user1.name = "Michael"
//    val user2 = User(1, "Michael")
//
//    println(user1 == user2)
//
//    println("User Details: $user1")
//
//    val updatedUser = user1.copy(name = "Denis Panjuta")
//    println(user1)
//    println(updatedUser)
//
//    println(updatedUser.component1()) // print 1
//    println(updatedUser.component2()) // prints Denis Panjuta
//
//    val (id,name) = updatedUser
//    println("id=$id, name=$name")
//}




interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}


// Super Class, Parent Class, Base Class of Vehicle
open class Car(override val maxSpeed: Double, val name: String, val brand :String) : Drivable{
    open var range: Double = 0.0


    override fun drive(): String {
       return "driving the interface drive"
    }

    fun extendRange(amount: Double){
        if(amount > 0){
            range += amount
        }
    }
    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }


}

// Sub Class of Vehicle or Derived class of Vehicle,
class ElectricCar(maxSpeed: Double, name: String, brand:String, batteryLife: Double) : Car(maxSpeed, name, brand){
    override var range = batteryLife * 6
    var chargerType = "Type1"
    override  fun drive(distance: Double){
        println("Drove for $distance KM on  electricity")

    }
    override fun drive(): String {
        return "Drove for $range KM on electricity"

    }

    override fun brake() {
        super.brake()
        println("brake inside of electric car")
    }
}


//fun main(){
//    var audiA3 = Car(200.0,"A3","Audi")
//    var teslaS = ElectricCar(240.0,"S-Model","Tesla",85.0)
//    teslaS.chargerType = "Type2"
//    teslaS.extendRange(200.0)
//
//    teslaS.drive()
//    teslaS.brake()
//    audiA3.brake()
//
//    // Polymorphism
//    audiA3.drive(200.0)
//    teslaS.drive(200.0)
//}


abstract class Mammal(val name: String, val origin: String,
                      val weight: Double) {   // Concrete (Non Abstract) Properties

    // Abstract Property (Must be overridden by Subclasses)
    abstract var maxSpeed: Double

    // Abstract Methods (Must be implemented by Subclasses)
    abstract fun run()
    abstract fun breath()

    // Concrete (Non Abstract) Method
    fun displayDetails() {
        println("Name: $name, Origin: $origin, Weight: $weight, " +
                "Max Speed: $maxSpeed")
    }
}

class Human(name: String, origin: String, weight: Double,
            override var maxSpeed: Double): Mammal(name, origin, weight) {

    override fun run() {
        // Code to run
        println("Runs on two legs")
    }

    override fun breath() {
        // Code to breath
        println("Breath through mouth or nose")
    }
}

class Elephant(name: String, origin: String, weight: Double,
               override var maxSpeed: Double): Mammal(name, origin, weight) {

    override fun run() {
        // Code to run
        println("Runs on four legs")
    }

    override fun breath() {
        // Code to breath
        println("Breath through the trunk")
    }
}

//fun main() {
//    val human = Human("Denis", "Russia",
//        70.0, 28.0)
//    val elephant = Elephant("Rosy", "India",
//        5400.0, 25.0)
//
//    human.run()
//    elephant.run()
//
//    human.breath()
//    elephant.breath()
//
//}

//fun main(){
//
//    val stringList : List<String> = listOf("Denis", "Frank", "Michael","Garry")
//    val mixedTypeList: List<Any> = listOf("Denis", 31, 5, "BDay", 70.5,"weights", "Kg")
//
//    for(value in mixedTypeList){
//        if(value is Int){
//            println("Interger: $value")
//        }else if(value is Double){
//            println("Double: '$value' with Floor value ${Math.floor(value)}")
//
//        }else if(value is String){
//            println("String: '$value' of length ${value.length}")
//        }else{
//            println("Unknown Type")
//        }
//    }
//
//    // Alternatively
//    for (value in mixedTypeList){
//        when(value){
//            is Int -> println("Interger: $value")
//            is Double ->  println("Double: '$value' with Floor value ${Math.floor(value)}")
//            is String ->  println("String: '$value' of length ${value.length}")
//            else ->   println("Unknown Type")
//        }
//    }
//
//    // SMART CAST
//    val obj1: Any = "I have a dream"
//    if(obj1 !is String){
//        println("Not a String")
//    }else{
//        // obj is automatically cast to a String in this scope
//        println("Found a String of length${obj1.length}")
//    }
//}


//fun main(){
//
////    var numbers: IntArray = intArrayOf(1,2,3,4,5,6)
//
////    var numbers = intArrayOf(1,2,3,4,5,6)
//
//    var numbers = arrayOf(1,2,3,4,5,6)
//    var numbersD: DoubleArray = doubleArrayOf(1.0,2.0,3.0,4.0,5.0,6.0)
//    print("initial values ${numbers.contentToString()}")
//    numbersD[0] = 6.0
//    numbersD[1] = 5.0
//    numbersD[4] = 2.0
//    numbersD[5] = 1.0
//    print("\ninitial values ${numbers.contentToString()}")
//
//    val mix = arrayOf("Sun","Mon", "Tues", 1, 2, 3, Fruit("Apple",2.5))
//    print(mix.contentToString())
//
//    var fruits = arrayOf(Fruit("Apple",2.5), Fruit("Grape",3.5))
//    for(index in fruits.indices){
//        print("${fruits[index].name} is in index $index")
//    }
//
//    // print(numbers.contentToString())
////    for(element in numbers){
////        print(" ${element+2}")
////    }
//}
//
//data class  Fruit(val name: String, var price: Double)


//fun main(){
//
//    val months = listOf("January", "February", "March")
//    val anyTypes = listOf(1,2,3,true, false, "String")
////    print(anyTypes.size)
//    print(months[1])
////
////    for(month in months){
////        println(month)
////    }
//
//    val addionalMonths = months.toMutableList()
//    var newMonths = arrayOf("April", "May", "June")
//    addionalMonths.addAll(newMonths)
//    print(addionalMonths)
//
//    val days = mutableListOf<String>("Mon","Tue","Wed")
//    days.add("Thue")
//    days[2] = "Sunday"
////    days.removeAt(3)
//    val removeList = mutableListOf<String>("Mon","Wed")
//    days.removeAll(removeList)
//    print(days)
//
//}

fun main(){

    var fruits = setOf("Orange", "Apple", "Mango", "Grape", "Apple")
//    print(fruits.toSortedSet())

    val newFruits  = fruits.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
//    print(newFruits.elementAt(4))

    val daysOfTheWeek = mapOf( 1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")

    for(key in daysOfTheWeek.keys){

        print("$key is to ${daysOfTheWeek[key]}")

    }

    val fruitsMap = mapOf("Favorite" to Fruit("Grape", 2.5), "OK" to Fruit("Apple", 1.0))

    val newDaysOfWeek = daysOfTheWeek.toMutableMap()
    newDaysOfWeek[4] = "ThursDay"
    newDaysOfWeek[5] = "Friday"

    print(newDaysOfWeek.toSortedMap())

}

data class  Fruit(val name: String, var price: Double)


package com.example.callcount.practice


fun main(){
    val nameList= listOf("Charles","Apl","Lydia","Eva","Juliet","ris")

    val groupName =nameList
        .fold("") {s,t-> "$s$t" }

    val moreThanFour=nameList
        .filter { it.length>4 }
        .reduce { s, t -> "$s$t" }

    val namesAndAges= mapOf("Charles" to 23,"Apl" to 17,"Lydia" to 15,"Eva" to 24,"Juliet" to 19,"ris" to 27)
    val under25 =namesAndAges
        .filter { myMap-> myMap.value<25 }
//        .forEach { (t, u) -> println("$t : $u") }

    val eighteen= mutableListOf<String>()
    val eighteenAndAbove = namesAndAges
        .filter { myMap-> myMap.value>18 }
        .map { it.key }

    fun repeatGreeting(times:Int,task:()->Unit){
        for(i in 1..times){
            task()
        }
    }
//
//    repeatGreeting(10){println("Kotlin Apprentice is a great book!") }

    fun mathSum(length: Int,series:(Int)->Int):Int{
        val numbers= mutableListOf<Int>()
        for(i in 0..length) numbers.add(i)
        return series(length)
    }

    val appRatings = mapOf(
        "Calendar Pro" to arrayOf(1, 5, 5, 4, 2, 1, 5, 4),
        "The Messenger" to arrayOf(5, 4, 2, 5, 4, 1, 1, 2),
        "Socialise" to arrayOf(2, 1, 2, 2, 1, 2, 4, 2)
    )
    val getAverage:(Array<Int>)->Double={myArray->
        var sum = 0
        myArray.forEach {
            sum+=it
        }
        sum/myArray.size.toDouble()
    }
    val newMap = mutableMapOf<String,Double>()
    appRatings.forEach { (t, u) ->
        println("$t ${getAverage(u)}")
        newMap[t] = getAverage(u)
    }
    val greaterThan3=newMap
        .filter { thisMap-> thisMap.value>3.0 }
        .map { it.key}

    println(greaterThan3)
}


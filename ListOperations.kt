package com.example.kotlinbasics

fun main(){

    val fruitsList= mutableListOf("Mango","Watermelon","Apple","Banana","Peach")
    fruitsList.add("kiwi")
    fruitsList.removeAt(2)
    fruitsList.contains("Peach")
    println(fruitsList)

}
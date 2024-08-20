package com.example.kotlinbasics

import android.graphics.Insets.add

fun main(){
    println("Enter number 1= ")
    val num1= readln()
    val num1Int = num1.toInt()
    println("Enter number 2= ")
    val num2= readln()
    val num2Int=num2.toInt()


    val myresult= add(num1Int,num2Int)
    println(myresult)

}

fun add(num1Int: Int, num2Int: Int): Int {
    val result =num1Int+num2Int
    return result

}


fun coffeedetails(){
    println("Enter Your Name :")
    val name = readln()
    println("How Many Sugar Spoon do you want?")
    val sugarCount = readln()
    val sugarCountInt=sugarCount.toInt()
    makeCoffee(sugarCount = 1, name)
}
fun makeCoffee(sugarCount: Int , name :String)
{
    if (sugarCount == 1)
    {
    println("   Coffee with $sugarCount spoon of sugar for $name")
    }
    else if (sugarCount==0)
    {
        println("No sugar for $name")
    }
    else
    {
        println("Coffee with $sugarCount spoon of sugar for $name")
    }
}
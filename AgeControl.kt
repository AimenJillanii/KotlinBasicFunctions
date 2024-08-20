package com.example.kotlinbasics

fun main()
{
    var age=0
    var enteredvalue= readln()
    age=enteredvalue.toInt()
    if (age>=18&&age<=40)
    {
        println("you can go to club")
    }
    else if(age<18)
    {
        println("you cannot go to club")
    }
    else
    {
        println("nothing")
    }
}
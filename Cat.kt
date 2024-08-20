package com.example.kotlinbasics

class Cat(val name:String,val breed :String, var age:Int) {
    init {
        meow(name)
    }

    fun meow(name: String){
        println("$name says Meow meow")
    }
}
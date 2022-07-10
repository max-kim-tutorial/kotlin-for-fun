package com.kotlinplayground.basics

class Variable {}

// 변수
// val : 상수, var : 변수
// 타입
// 원시타입과 래퍼타입의 구분이 없다.
fun main() {
    val name : String = "hello"
    println(name)

    var age : Int = 34
    println(age)
    age = 35
    println(age)

    // automatic inferring type
    val salary : Long = 30000L // Long
    println(salary)

    val course = "kotlin Spring"
    println("course : $course and the course length is ${course.length}") // string interpolation

    val multiline = "ABC \n DEF"
    println(multiline)

    val multiline1 = """
        ABC
        DEF
    """.trimIndent() // \n없이 개행 반영 가능함

    println(multiline1)
}


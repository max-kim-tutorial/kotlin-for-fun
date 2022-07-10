package com.kotlinplayground.basics

class Conditions {
}

fun main() {
    var name = "Alex"
    name = "Chloe"

    // 오 이게 뭐냐
    //! if문도 값을 리턴할 수 있다. 블럭에 암시적으로 위치한 last statement가 리턴값이 된다
    val result = if (name.length == 4) {
        println("Name is Four Characters")
        name
    } else {
        println("Name is Not Four Characters")
        name
    }
    println("result: $result")

    // kotlin은 switch-case가 없고 when 블락 구문을 이렇게 사용
    // 리턴이 아니라 실행할때는 도다른 블락 사용
    val position = 1
    val medal = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "No Medal"
    }
    println(medal)
}
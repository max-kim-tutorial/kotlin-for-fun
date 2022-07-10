package com.kotlinplayground.basics

class LabelsAndReturn {
}

fun main() {
    for(i in 1..5) {
        println("i in $i")
        if(i == 3) break
    }

    label()

    println("End of the Program!")
}

fun label() {
    // for문에 label을 만들어 그것으로 참조 가능
    loop@ for(i in 1..5) {
        println("i in label $i")
        if(i == 3) break@loop

        innnerloop@ for(j in 1..5) {
            println("j in label $j")
            // if (j==2) break@innnerloop
            if (j==2) continue@loop // 두 statement는 같음
        }
    }
}
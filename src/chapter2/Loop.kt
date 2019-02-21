package chapter2

import java.util.*


fun main(args: Array<String>) {
    loop1To100()

}

fun loop1To100() {
    for (i in 1..100) {
        println("$i")
    }
}

/**
 *  - downTo 역방향 수열
 *  - step 증가값
 */
fun loop100To1() {
    for (i in 100 downTo 1 step 2) {
        println("$i")
    }
}

/**
 *  - Map을 Iterator하는 로직은 자주 쓰는 패턴이다
 */
fun loopForMap() {
    val map = TreeMap<Int, String>()

    for (i in 1..10) {
        map[i] = i.toString()
    }

    for ((index, code) in map) {
        println("$index = $code")
    }
}

/**
 *  - List를 index와 함께 loop를 돌리는 예제이다.
 *  - 정말 유용한 예제이다. 그동안 자바에서 Index가 필요한 loop가 은근히 자주 있었는데....
 */
fun loopForListWithIndex() {
    val list = arrayListOf(1, 2, 3, 4, 5)

    for ((index, element) in list.withIndex()) {
        println("$index = $element")
    }
}

/**
 *  - in 키워드로 contain 같이 사용할 수 있다
 *  - in 키워드는 Java.lang.Comparable 인터페이스가 구현된 객체를 범위로 사용 할 수있다.
 */
fun exampleForIn(c: Char) {

    println(c in 'a'..'z')
    println(c !in '0'..'9')

    println("wang" in "Java".."9")

}
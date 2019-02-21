package chapter2

import java.io.IOException


fun main(args: Array<String>) {
    exceptionExample()
    tryExample()
}

/**
 *  - throw는 식이기 때문에 아래와 같이 사용할 수 있다
 *  - num은 정상적인 경우에는 초기화를 진행하고 else를 실행하게되면 예외를 던진다
 *  - IOException은 checked Exception인데도 불과하고 Kotlin은 예외를 명시적으로 처리하지 않아된다!!!!!!
 */
fun exceptionExample() {
    val n = 100
    val num =
            if (n in 1..100) {
                n
            } else {
                throw IOException("exception!!!")
            }

    println(num)
}

/**
 *  - try 블록도 식이기 때문에 값을 만들어 낼 수 있다
 *  - try 블록의 마지막 식의 값이 결과값
 *  - 에외 발생 후 catch에 마지막 식에 예외를 던지는 것이 아닌 값을 주면 결과값을 리턴한다
 */
fun tryExample() {

    val number = try {
        Integer.parseInt("123")
    } catch(e: NumberFormatException) {
        null
    }

    println(number)
}
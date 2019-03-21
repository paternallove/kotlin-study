package strings

fun main(args: Array<String>) {
    val lastChar_v1 = "Hello".lastChar_v1()
    println(lastChar_v1)

    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)
}

/** Receiver Type, Receiver Object */

/**
 *  확장 함수 안에서는 private, protected는 사용 불가
 */
fun String.lastChar_v1() : Char = this.get(this.length - 1)
fun String.lastChar_v2() : Char = this[length - 1]
fun String.lastChar_v3() : Char = get(length - 1)

/**
 *  확장 프로퍼티
 *      - 상태를 가질 수 없다
 *      - 코드를 짧게 작성할 수 있다
 *      - 최소한 Getter는 꼭 작성 해야함
 */
val String.lastChar : Char
    get() = get(length - 1)

var StringBuilder.lastChar : Char
    get() = get(length - 1)
    set(value: Char) = setCharAt(length - 1, value)




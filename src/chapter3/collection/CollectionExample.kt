package collection


fun main(args: Array<String>) {
//    콜렉션_선언하다()

//    콜렉션_제공되는_확장함수()
//
//    가변_인자_함수("hi", "I'm", "Dongree")
//
//    중위_호출()
}

fun 중위_호출() {
    val pair = 1.to("One") /** 중위 호출 : Pair instance 반환 */
    val (num, name) = 1 to "One" /** Destructuring declaration */
    println(num)
    println(name)
    println(pair.first)
    println(pair.second)
    println(pair)
}

fun <T> 가변_인자_함수(vararg values: T) {
    /** Spread 연산자 */
    val list = listOf(*values)
    println(list)
}

fun 콜렉션_제공되는_확장함수() {
    val str: List<String> = listOf("a", "b", "c")
    println(str.last())
    println(str.max())
}

/**
 *  코틀린은 자신만의 컬렉션이 없다
 *      - 자바와의 호환성을 위함
 *      - 차이점은 코틀린에서 자바보다 더 많은 기능을 사용 가능
 */
fun 콜렉션_선언하다 () {
    val list = arrayListOf(1, 8, 2)
    val list2 = arrayListOf(1, 8, 2.3)
    var list3 = arrayListOf(1, "d")
//    var list2 = arrayListOf<Int>(1, 8, 2.3)
//    list.add("d")

    var set = hashSetOf(1, 2, 3)

    /**
     * to는 예약어가 아니라 함수
     */
    var map = hashMapOf(1 to 3, 2 to "a", 3 to 3.4)

    println(list)
    println(list2)
    println(list3)
//    println(set)
//    println(map)
//
//    println(list.javaClass) // == getClass()
//    println(set.javaClass)
//    println(map.javaClass)
}

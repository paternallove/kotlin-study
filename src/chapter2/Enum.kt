package chapter2

/**
 *  - enum은 kotlin 선언이 Java보다 더 많은 키워드가 들어간다
 *  - Kotlin에서 enum은 soft keyword라 부른다
 *  - enum은 뒤에 class 키워드가 붙어야만 키워드로 인식
 *  - 그럼 enum이라는 이름을 사용하기 위해 이렇게 ??? 굳이???
 *  - 세미콜론이 필수로 필요한 경우
 *  -- enum 상수목록과 메소드를 구분 짓기 위함...
 */
enum class Color(val r: Int, val g: Int, val b: Int) {

    RED(255, 0,0),
    ORANGE(255, 165, 0),
    BLUE(0, 0, 255),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun main(args: Array<String>) {

    println(Color.ORANGE.rgb())
}
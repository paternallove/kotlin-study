package chapter2

/**
 *  - when은 java의 switch 문과 같은 역할이다
 */
fun getMnemonic(color: Color) =
        when (color) {
            Color.RED -> "Richard"
            Color.ORANGE, Color.BLUE -> "Of"
            else -> "else"
        }

/**
 *  Kotlin의 when식은 Java의 switch문 보다 강력하다
 *  - when의 분기 조건은 객체를 허용!!!
 *  - 분기 조건은 동등성을 사용
 */
fun mix(c1: Color, c2: Color) =
        when (setOf(c1, c2)) {
            setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
            setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
            setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
            else -> throw Exception("Dirty color")
        }

/**
 *  인자 없는 when
 *  - 위와 비교했을때 Set 인스턴스를 생성하지 않기 때문에 비용을 아낄 수 있는 장점이 있지만 그래도 위 방식이 좋아 보임
 */
fun mixOptimized(c1: Color, c2: Color) =
        when {
            (c1 == Color.RED && c2 == Color.YELLOW) -> Color.ORANGE
            else -> throw Exception("Dirty Color")
        }


/**
 *  스마트 캐스트
 *  - 아래 코드 처럼 is 키워드를 통해 타입 체크 후 강제 캐스팅을 하지 않아도 마치 캐스팅 된 것 처럼 사용할 수 있다
 *
 *  강제 캐스트
 *  - as 키워드를 사용해서 java 처럼 강제 캐스팅을 할 수 있다
 *
 *  아래 코드를 Intellij의 자동 완성 도움으로 바로 when 식으로 converting 할 수 있다
 *  블록의 마지막 식이 블록의 결과다... 기억하자...
 */
fun smartCast(o: Collection<Int>) {
    if (o is HashSet) {
        o.add(1)
    } else if (o is ArrayList) {
        o.add(2)
    }
    else {
        val arr = o as HashMap<Int, Int>
        arr.put(1, 1)
    }
}


fun main(args: Array<String>) {
    getMnemonic(Color.ORANGE)
    mix(Color.RED, Color.YELLOW)
}
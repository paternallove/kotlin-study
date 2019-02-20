package chapter2

/**
 *  - when은 java의 switch 문과 같은 역할이다
 */
fun getMnemonic(color: Color) =
        when (color) {
            Color.RED -> "Richard"
            Color.ORANGE, Color.BLUE -> "Of"
        }


fun main(args: Array<String>) {
    getMnemonic(Color.ORANGE)
}
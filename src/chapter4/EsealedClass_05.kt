package sealedClass

// 중첩클래스, 내부클래스

// 코틀린 컴파일러는 when을 사용해 Expr 타입의 값을 검사할 때 꼭 디폴트 분기인 else 분기를 덧붙이게 강제한다
//interface Expr
//class Num(val value: Int) : Expr
//class Sum(val left: Expr, val right: Expr) : Expr
//
//fun eval(e: Expr): Int =
//        when (e) {
//            is Num -> e.value
//            is Sum -> eval(e.right) + eval(e.left)
//            else -> {
//                throw Exception()
//            }
//        }

// else가 필요없는 sealed class when
// sealed 클래스 : 봉인!?

sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
//    class ZZZ() : Expr() // compile error
}

fun eval(e: Expr): Int =
        when (e) {
            is Expr.Num -> e.value
            is Expr.Sum -> eval(e.right) + eval(e.left)
            else -> {
                throw Exception()
            }
        }

//class Expr2 : Expr() { // compile error
//
//}

fun main(args: Array<String>) {
    println(eval(Expr.Sum(Expr.Num(1), Expr.Num(2))))
//    println(eval(Expr.Sum(Expr.Num(1), Expr.Num(2))))
}

// sealed interface 는 안된다고 합니다.
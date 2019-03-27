package singleton

//import singleton.Num.Companion.bar

//import singleton.Num.Companion.bar

// singleton

open class Parent() {
    fun nothing() = println("nothing to do")
}

// object 는 생성자를 쓸 수 없다. 생성자 호출 없이 즉시 만들어짐, 상속도 가능함.
object StaticValues : Parent() {
    val endString: String = "END"
        get() = field + "!"

    fun endDate(): String = "9999-12-31"
}

//fun main(args: Array<String>) {
//    println(StaticValues.endString)
//    println(StaticValues.endDate())
//
//    StaticValues.nothing()
//}


data class Num(val n: Int) {
    object NumComparator : Comparator<Num> { // 클래스 안에도 객체를 선언할 수 있음. (바깥 클래스의 인스턴스마다 중첩 객체 선언에 해당하는 인스턴스가 하나씩 따로 생기는 것은 아니다)
        override fun compare(p1: Num, p2: Num): Int = p1.n - p2.n
    }

//    companion object { // 동반 객체
//        fun bar() = println("companion bar")
//    }

    companion object Calc {
        fun addTen(p: Int): Num = Num(p + 10)
        fun dddd( ) {}
    }
}


//fun main(args: Array<String>) {
//    val nums = listOf(Num(2), Num(1), Num(5))
//
//    println(Num.NumComparator.compare(Num(1), Num(2)))
//
//    println(nums.sortedWith(Num.NumComparator))
//
////    bar() // == Num.bar()
//
//    var num = Num.Calc.addTen(101)
////    println(num.n)
//}


// 무명객체

abstract class MouseEvent{
    abstract fun leftClick()
    abstract fun rightClick()
}

interface KeyboardEvent{
    fun keyPressDown()
    fun keyPressUp()
}

fun main(args: Array<String>) {
    println(
            object: MouseEvent() {
                override fun leftClick() {
                    println("leftClick")
                }

                override fun rightClick() {
                    println("rightClick")
                }
            }
    )
}

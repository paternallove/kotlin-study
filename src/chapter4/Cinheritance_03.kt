package inheritance_03

interface Clickable {
    fun click()
}

interface Clickable2 {
    fun click()
}

// default는  final 이며 open 은 inheritable
open class RichButton : Clickable {
    override fun click() =  println("RichButton click()")
//    final override fun click() =  println("override click()")
}

class RichRichButton : RichButton(), Clickable2 {
//    override fun click() = println("RichRichButton click()")

}

// Clickable2의 Impl이 없는데 어떻게 RichButton()에 있는지 알고 얘가 에러를 안내냐?


// 상속 제어 변경자 (final, open, abstract, override)
abstract class AbstractClickable : Clickable {
    abstract fun abstractClick()  // override O (필수)

    open fun openClick() {} // override O

    final fun finalClick() {} // override X

    final override fun click() = println("override click()") // override 중 (하위 클래스의 override를 금지하려면 final 줘야됨)
}

open class PoorButton : AbstractClickable() {
    override fun abstractClick() {
        println("PoorButton click2 무조건 구현 필요")
    }

//    override fun finalClick() {}
}



// 가시성 변경자 (public : 모든곳, internal : 모듈, protected : 하위클래스, private : 같은클래스)
// 코틀린 protected 멤버는 상속한 클래스만 사용가능
// 클래스 확장함수는 private, protected 멤버에 접근 못함
internal open class A {
    private fun m1() = println("m1")
    protected fun m2() = println("m2")
    public final fun m3() = println("m3")
    fun m4() = println("m4")
    // JAVA - public final void m4$kotlin_study23 : 모듈은 한 번에 한꺼번에 컴파일되는 코틀린 파일들을 의미한다 ?
}

// 확장함수 안됨 클래스 가시성을 internal class -> public class 으로 바꾸거나, 아래 fun에 internal 을 추가해야됨
internal fun A.m() {
//    m1()
//    m2()
    m3()
    m4()
}


// private class 도 Kotlin 에서 존재 :
private class privateClass {
    fun a() {}
}

/** Java
 * final class privateClass {
        public final void a() {}
    }
 */



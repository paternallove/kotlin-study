package nestedClass_04

import java.io.Serializable

interface State : Serializable

interface View {
    fun getCurrentState() : State
    fun restoreStatus(State:State) {}
}


/**
 * Java
 * public class Button implements View {
 *
 *      @Override
 *      public State getCurrentState() { return new ButtonState() }
 *
 *      @Override
 *      public void restoreState (State state) {}
 *
 *      public class ButtonState Implements State {}
 * }
 */


class Button : View {
    override fun getCurrentState(): State = ButtonState()
    override fun restoreStatus(State: State) {}
    class ButtonState : State {} // JAVA - public static final class ButtonState implements State
    inner class XState : State {} // JAVA - public final class XState implements State
}

// 중첩 클래스 안에서 바깥쪽 클래스 참조
class Outer {
    val a = "a"
    inner class Inner {
        fun getOuterReference() : Outer = this@Outer //

        fun getAFromOuter() = println(this@Outer.a)
    }
}


fun main(args: Array<String>) {
    val button = Button()

    val outer = Outer()
    outer.Inner().getOuterReference().Inner().getOuterReference().Inner().getOuterReference();

//    var outerReference = Outer().Inner().getOuterReference().Inner().getOuterReference().Inner().getOuterReference().Inner()
}
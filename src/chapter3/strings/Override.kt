package strings

fun main(args: Array<String>) {
    val button: Button = Button()
    button.click()

    /** 무엇이 출력 될까? */
    button.showOff()
    button.hide()
}

/** open을 안쓰면 어떻게 될까? */
open class View {
    open fun click() = println("View clicked")

    fun hide() = println("View Hide")
}

class Button : View() {
    override fun click() = println("Button clicked")
}

fun View.showOff() = println("View Show!!")

fun Button.showOff() = println("Button Show!!")

fun View.hide() = println("View Extension Hide!!")

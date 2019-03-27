package interface_02

interface Clickable {
    fun click()
    fun showOff() = println("Clickable.showOff()") // interface default 구현 메소드
}

interface Focusable {
    fun setFocus(b:Boolean) = println("Focusable.setFocus(${if(b) "GOT" else "LOST"})")

    fun showOff() = println("Focusable.showOff()")
}

class Button : Clickable, Focusable {

    override fun showOff() {
//        super.showOff()
        super<Clickable>.showOff() // super의 showOff가 2개이기때문에 명시해줘야함.
        super<Focusable>.showOff() // JAVA - Focusable.super.showOff()
        println()
    }

    override fun click() = println("Button.click()")
}

fun main(args: Array<String>) {
    val button = Button()
    println("---------------------------")
    button.click()
    println("---------------------------")
    button.showOff()
    println("---------------------------")
    button.setFocus(true)
    println("---------------------------")
}
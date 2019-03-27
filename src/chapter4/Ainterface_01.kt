package interface_01

// kotlin default final public

interface Clickable {
    fun click()
    fun showOff() = println("Clickable.showOff()")
}

class Button : Clickable { // possible n implementing, 1 extends

    // @Override == override
    // 동일한 메소드명이 존재할때는 override 필수 : 제거하면 컴파일 에러
    override fun click() = println("Button.click()")

//    override fun showOff() = println("Button.click()")
}

fun main(args: Array<String>) {
    val button = Button()
    button.click()
    button.showOff()
}

// 심플!
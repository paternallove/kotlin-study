package chapter2


/**
 *  - 클래스 & 프로퍼티 & 생성자 & Getter & Setter까지 동시에 생성되는 코드
 *  - Kotlin의 기본 가시성은 Public
 */
class Person(
        val name: String,
        var isMarried: Boolean
)

/**
 *  커스텀 접근자
 *  - isSquare 프로퍼티의 getter만 생성하는 코드
 *  - 커스텀 Getter와 getSquare의 차이... 가독성.
 *  - 책에서는 클래스의 특성을 정의하고 싶으면 프로퍼티로 정의해야된다는데 무슨말인지... 공감안됨...
 */
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
    get() {
        return height == width
    }

    fun getSquare() = height == width
}

/**
 *  - new 키워드 없이 생성자 호출
 *  - Person 객체의 프로퍼티에 직접 접근한것 처럼 보이지만 사실 Getter를 호출한 것이다
 */
fun main(args:Array<String>) {

    val person = Person("wang", true)
    person.isMarried = false

    println(person)
    println(person.name)
    println(person.isMarried)

    val rectangle = Rectangle(10, 10);
    println(rectangle.isSquare)
    println(rectangle.getSquare())
}
package dataClass

import singleton.Num
import singleton.Parent

// equals, hashCode, toString
// data class
// Decorate pattern

class Client(val name: String, val postCode: Int) {

    override fun toString() = "Client(name=$name, postCode=$postCode)"

    override fun equals(other: Any?) : Boolean {  // Any == java.lang.Object에 대응하는 클래스로 ?는 null 허용을 의미
        if (other == null || other !is Client)
            return false
        return name == other.name && postCode == other.postCode
    }

    // JVM 언어에서의 제약 : equals 가 true를 반환하는 두 객체는 반드시 같은 hashCode)를 반환해야 한다
    // equals를 오버라이드 할 때 반드시 hashCode도 함께 오버라이드 해야 함.
    override fun hashCode(): Int = name.hashCode() * 31 + postCode

    // 이런식으로 카피해서 쓰면 원본의 영향을 끼치지 않는데요
    fun copy(name: String = this.name, postCode: Int = this.postCode) = Client(name, postCode)

}

data class ClientV2(val name: String, val postCode: Int){
    override fun toString() = "Client1111111(name=$name, postCode=$postCode)"
}


//fun main(args: Array<String>) {
//    val client1 = Client("내셔", 1111)
//    val client2 = Client("내셔", 1111)
//
//    println(client1)
//    println(client1==client2)
//
//    println("-------------------------------")
//
//    val clientV2_1 = ClientV2("내셔", 1111)
//    val clientV2_2 = ClientV2("내셔", 1111)
//
//    println(clientV2_1)
//    println(clientV2_1==clientV2_2)
//
//    println("-------------------------------")
//
////    println(client1.copy())
//
//}


// Decorate
class Deco<T> : Collection<T> {
    private var innerList = arrayListOf<T>()

    override val size: Int
        get() = innerList.size

    override fun contains(element: T): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isEmpty(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun iterator(): Iterator<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

//open class Parent() {
//    fun nothing() = println("nothing to do")
//}

// object 는 생성자를 쓸 수 없다. 생성자 호출 없이 즉시 만들어짐, 상속도 가능함.
object StaticValues : Parent() {
    val endString: String = "END"
        get() = field + "!"

    fun endDate(): String = "9999-12-31"
}


class Deco2<T>(innerList: Collection<T> = ArrayList()) : Collection<T> by innerList {

}

fun main(args: Array<String>) {

    StaticValues.endString

//    Deco<String>()
    var deco2 = Deco2<String>(arrayListOf("1", "2"))

    println(deco2.contains("0"))

//    Num.bar()
}
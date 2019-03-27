package classConstructor

import singleton.StaticValues

// Primary 생성자 + Init Block
// Secondary 생성자
// Custom getter / setter


// 1. Primary 생성자
class A(val p: String)

class B constructor(_p: String) { // val 이 빠짐, constructor 생략 가능
    val p: String

    init {  // 초기화 블록은 Primary 생성자와 함께 사용된다.
        p = _p + "1"
    }
}

class C(val a: String = "a", val isB: Boolean = true) // default 생성자 자동 생성됨

open class D(val a: String, val isB: Boolean = true)

class F : D("내셔") // 인자있는 C의 Primary 생성자 호출, 상속 -> 이 규칙 때문에 상속에 ()가 붙음

class Secret private constructor() {} // private constructor 라서 외부에서 생성자 접근이 불가능하다.


// 2. Secondary 생성자 & custom getter setter
// 생성자에 Default Value를 가진 Parameter가 있기 때문에 JAVA 보다 생성자 수가 적다. (Default를 이용하라)
open class G constructor(_p: String) {
    var aa: String = ""
//            get() = "왕" + aa // custom getter (recursive 주의)
            get() = "왕" + field // field 를 사용해야함

    var bb: Int = 0
        set(_b) { // private 가능
            field = _b * 10 + field
        }

    init {
        aa = _p
    }

    constructor(a: String, b: Int) : this(a) { // this() 를 통해 자신의 다른 생성자를 생성할 수 있따
        bb = b
    }

    constructor(a: String, b: Int, c: Int) : this(a, if (b < c) c else b)

}


fun main(args: Array<String>) {
//    var secret = Secret()
    var g = G("내셔", 3)
    println(g.bb.toString() + "_" + g.bb)
//    g.bb = 100

    StaticValues.endDate()
}



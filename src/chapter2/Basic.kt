package chapter2

/**
 *  함수 선언
 *  - fun 키워드 사용
 *  - 함수를 최상위 수준에 정의할 수 있다. 자바와 달리 클래스 안에 함수를 넣을 필요가 없다. 그럼 클래스가 없는건가? (퀴즈)
 *  - 세미 콜론이 필요없다
 */
fun main(args: Array<String>) {

    println("Hello, world!")

    println(max1(1, 2))

    stringTemplate()
}

/**
 *  함수에 반환 값을 명시하는 예제
 *  - Kotlin에서 사용하는 if문은 문장(statement)가 아닌 식(Expression)이다. 즉 값을 만들어 낼 수 있다.
 *  - 아래 함수는 블록이 본문인 함수라고 부른다
 */
fun max1(a: Int, b: Int): Int {
    return if (a > b) a else b
}

/**
 *  - 아래는 식이 본문인 함수라고 부른다
 *  - 더 제거할 수 있는 코드는?
 *  - (궁금) 아래 코드가 과연 보기 좋은 코드가 맞는것인가?
 *  - 주의 할 점
 */
fun max2(a: Int, b:Int): Int = if (a > b) a else b


/**
 *  변수 선언 방법
 *  - 컴파일러가 초기화 식을 분석해 타입을 지정해준다.
 *  - 테스트하다가 이상한 부분을 발견했는데 answer1 변수를 선언만하고 사용하지 않은 특이한 현상이 있다.
 *
 */
fun variable1() {
    val question = "test"
    val answer1 = 42
    val test = 7.5e6

    println(question)
    println(answer1)
}

/**
 *  val vs var
 *  - val(value) : 변경 불가능한 immutable 변수
 *  - var(variable) : 변경 가능한 mutable 변수
 *
 *  꼭 필요할때만 var 키워드를 사용하라...
 *  - 아래 코드를 자바 코드로 변환했을 때 어떻게 될까?
 */
fun variable2() {
    val str1 = "str1"
    var str2 = "str2"
}

/**
 *  문자열 템플릿
 *  - 문자열 안에 변수를 사용하여 출력
 *  - 단순 변수일때는 괄호가 필요없지만 그래도 괄호를 넣는것을 권장함. 나중에 정규식으로 찾기 편함.
 */
fun stringTemplate() {
    val name = "wangdaun"
    println("Hello, ${name}!");
}

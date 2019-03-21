@file:JvmName("StringFunc")

package strings

import java.lang.StringBuilder

fun main(args: Array<String>) {
    코틀린_스타일_함수(version = 1)

}

fun 코틀린_스타일_함수(version: Int) {
    val list = mutableListOf(1, 2, 3)

    when (version) {
        1 -> {
            /** 1. 선언부가 번잡함, 인자도 많음 */
            println("1: " + 리스트에_구분자_넣다_v1(list, "; ", "(", ")"))
            println("-------------------------------------------------------")
        }
        2 -> {
            /** 2. 어느 하나라도 인자 이름을 명시하면 그 뒤도 동일하게 명시해줄 것! */
            println("2: " + 리스트에_구분자_넣다_v1(list, separator = "; ", prefix = "(", postfix = ")"))
            println("-------------------------------------------------------")
//            list.add(1)
//            list.add(param = 1)
        }
        3 -> {
            /** 3. Default Parameter ! */
            println("3: " + 리스트에_구분자_넣다_v2(list))
            println("3: " + 리스트에_구분자_넣다_v2(list, "; "))
            println("3: " + 리스트에_구분자_넣다_v2(list, postfix = ")", prefix = "(", separator = "; "))
            println("-------------------------------------------------------")
        }
        4 -> {
            /** 4. Extension Method ! */
            println("4: " + list.리스트에_구분자_넣다_final(separator = "; ", prefix = "(", postfix = ")"))
            println("-------------------------------------------------------")
        }
        else -> {
            /** 특정 타입에 제한두기 */
            println("String: " + listOf("a", "b", "c").문자열_리스트에_구분자_넣다("; ", "(", ")"))
        }
    }
}

fun Collection<String>.문자열_리스트에_구분자_넣다(
    separator: String,
    prefix: String,
    postfix: String
) = 리스트에_구분자_넣다_final(separator, prefix, postfix = postfix)



fun <T> 리스트에_구분자_넣다_v1(
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postfix: String
): String {
    val result = StringBuilder(prefix)
    for ((idx, element) in collection.withIndex()) {
        if (idx > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}



//@JvmOverloads
fun <T> 리스트에_구분자_넣다_v2(
    collection: Collection<T>,
    separator: String = ", ",
    /** Default Param **/
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((idx, element) in collection.withIndex()) {
        if (idx > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}



fun <T> Collection<T>.리스트에_구분자_넣다_final(
    separator: String = ", ",
    /** Default Param **/
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((idx, element) in this.withIndex()) {
        if (idx > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}


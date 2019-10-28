package com.xxyuan.`04类和对象`

/**
 * 类的初始化过程
 */
class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

fun main() {
    val initOrderDemo = InitOrderDemo("ceshi")

}
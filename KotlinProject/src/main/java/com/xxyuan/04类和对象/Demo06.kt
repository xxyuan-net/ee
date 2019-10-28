package com.xxyuan.`04类和对象`

/**
 * 伴生对象和扩展方法
 */
class MyClass{
    companion object {

    }
}

fun  MyClass.Companion.printCompanion() { println("companion") }

fun main() {
    MyClass.printCompanion()
}
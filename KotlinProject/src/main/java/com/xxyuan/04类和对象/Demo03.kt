package com.xxyuan.`04类和对象`

/**
 * 继承及接口
 */

interface MyInterface{
    fun bar()
    fun foo(){

    }
}

open class Child : MyInterface{
    override fun bar() {

    }
}

class  Child01 : Child() {
    override fun bar() {
        super.bar()
    }
}
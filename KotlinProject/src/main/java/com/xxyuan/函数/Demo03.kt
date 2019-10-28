package com.xxyuan.函数

/**
 * 可变长参数函数
 */
fun vars(vararg v:Int){
    for (vt in v){
        print(vt)
    }
}

fun main() {
    vars(1,2,3,4)
}
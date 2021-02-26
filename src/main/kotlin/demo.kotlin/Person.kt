package demo.kotlin

import demo.java.hello.enums.Gender

//主构造函数
class Person constructor(initName: String) {
    //主构造函数的参数可以在类里面属性赋值使用
    val name: String = initName
    var age: Int = 0
    lateinit var gender: Gender

    init {
        //主构造函数的参数可以在初始化代码中使用
        println("初始化啦,${initName}")
    }

    //一个类中可以有多个次级构造函数，每个次级构造函数都需要调用主构造函数
    constructor(name: String, age: Int) : this(name) {
        //次构造函数会调用主构造函数
        this.age = age
        println("次构造函数初始化啦")
    }

    constructor(name: String, age: Int, gender: Gender) : this(name) {
        this.age = age
        this.gender = gender
    }


}
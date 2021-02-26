package demo.kotlin

import demo.java.hello.enums.Gender

class Hello constructor() {
    private lateinit var nickNameField: String

    init {
        println("Hello构造函数调用")
    }

    constructor(age: Int) : this() {
        this.age = age
        println("次构造函数调用")

    }

    constructor(age: Int, gender: Gender) : this() {
        this.age = age
        this.gender = gender
    }

    //隐含getter，在Java中调用的时候，可以通过getName()访问。
    val name: String = "li"

    //隐含getter 和 Setter，
    var age: Int = 18

    lateinit var gender: Gender

    //自定义属性
    var nickName: String
        get() = this.nickNameField
        set(value) {
            this.nickNameField = value
        }


    fun sayHello(name: String): String {
        return "Hello,$name"
    }

    fun sum(i: Int, b: Int): Int = i + b


    fun main(args: Array<String>): Unit {
        println("Hello")
    }

    fun getString(objects: Any): Int? {
        if (objects !is String) return null

        return objects.length
    }


    fun forList(list: List<Int>) {
        for (l in list) {
            println(l)
        }

        for (index in list.indices) {
            println(list[index])
        }

        for (i in 1..5) {
            println(i)
        }
    }

    fun createDefaultPerson(): Person {
        return Person("li", 18, Gender.MALE)
    }

}

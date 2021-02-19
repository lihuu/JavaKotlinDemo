package demo.kotlin

//主构造函数
class Person constructor(initName: String) {
    val name: String = initName
    private var age: Int = 0

    init {
        println("初始化啦")
    }

    constructor(name: String, age: Int) : this(name) {
        this.age = age
        println("次构造函数初始化啦")
    }


}
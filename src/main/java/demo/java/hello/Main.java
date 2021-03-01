package demo.java.hello;

import demo.kotlin.Hello;
import demo.kotlin.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lihu
 */
public class Main {
    public static void main(String[] args) {
        Hello hello = new Hello();
        String message = hello.sayHello("Lihu");
        System.out.println(message);
        Person person = new Person("li");
        //jdk10 添加的新特性，局部变量可以使用var 进行类型推导
        var list = new ArrayList<String>();
        var stream = list.stream();
        var sringList = List.of("A", "B", "C");
    }
}

package demo.java.hello;

import demo.kotlin.Hello;
import demo.kotlin.Person;

/**
 * @author lihu
 */
public class Main {
    public static void main(String[] args) {
        Hello hello = new Hello();
        String message = hello.sayHello("Lihu");
        System.out.println(message);
        Person person = new Person("li");
        System.out.println(person.getName());
        person = new Person("li", 18);
        System.out.println(person.getAge());
    }
}

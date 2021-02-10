package demo.java.hello;

import demo.kotlin.Hello;

public class Main {
    public static void main(String[] args) {
        Hello hello = new Hello();
        String message = hello.sayHello("Lihu");
        System.out.println(message);
    }
}

package demo.java.hello;


import demo.java.hello.enums.Gender;
import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
public class User {
    private final String name;
    private final int age;
    private final Gender gender;
}

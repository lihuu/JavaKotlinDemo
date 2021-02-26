package demo.java.hello.model;


import demo.java.hello.enums.Gender;
import lombok.Builder;
import lombok.Getter;


/**
 * @author lihu
 */
@Getter
@Builder
public class User {
    private final String name;
    private final int age;
    private final Gender gender;
}

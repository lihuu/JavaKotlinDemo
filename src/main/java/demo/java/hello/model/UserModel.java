package demo.java.hello.model;

import demo.java.hello.enums.Gender;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserModel {
    private final String name;
    private final int age;
    private final Gender gender;
}

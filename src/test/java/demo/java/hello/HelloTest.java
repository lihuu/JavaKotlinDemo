package demo.java.hello;

import demo.java.hello.converter.UserConverter;
import demo.java.hello.enums.Gender;
import demo.java.hello.model.User;
import demo.java.hello.model.UserModel;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

public class HelloTest {
    @Test
    public void test(){
        User user = User.builder().age(18).name("li").gender(Gender.MALE).build();
        UserConverter userConverter = Mappers.getMapper(UserConverter.class);
        UserModel userModel = userConverter.toUserModel(user);
        assert userModel.getAge()==18;
        User newUser = userConverter.toUser(userModel);
        assert newUser.getAge()==18;
    }
}

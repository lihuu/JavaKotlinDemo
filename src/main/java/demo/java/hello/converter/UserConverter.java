package demo.java.hello.converter;

import demo.java.hello.model.User;
import demo.java.hello.model.UserModel;
import org.mapstruct.Mapper;

@Mapper
public interface UserConverter {
    UserModel toUserModel(User user);

    User toUser(UserModel userModel);
}

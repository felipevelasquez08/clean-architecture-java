package infrastructure.translate;

import domain.model.User;
import infrastructure.dto.UserDto;

public class UserTranslate {
    public static UserDto fromDomainToDto(User user) {
        return new UserDto(user.getName());
    }

    public static User fromDtoToDomain(UserDto user) {
        return new User(user.getName());
    }
}

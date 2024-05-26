package com.tokiproducts.toki.project.mapper;

import com.tokiproducts.toki.project.dto.ProductDto;
import com.tokiproducts.toki.project.dto.UserDto;
import com.tokiproducts.toki.project.entity.Product;
import com.tokiproducts.toki.project.entity.User;

public class UserMapper {

    public static UserDto mapToUserDto(User user) {

        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUsername(user.getUsername());
        userDto.setPassword(user.getPassword());

        return userDto;
    }

    public static User mapToUser(UserDto userDto) {

        User user = new User();
        user.setId(userDto.getId());
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());

        return user;

    }
}

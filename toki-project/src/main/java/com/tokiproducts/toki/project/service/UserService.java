package com.tokiproducts.toki.project.service;

import com.tokiproducts.toki.project.dto.UserDto;

public interface UserService {
    UserDto savedUser(UserDto newUser);

    boolean authenticateUser(String username, String password);
}

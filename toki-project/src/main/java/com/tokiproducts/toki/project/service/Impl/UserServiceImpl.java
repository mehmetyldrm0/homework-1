package com.tokiproducts.toki.project.service.Impl;

import com.tokiproducts.toki.project.dto.UserDto;
import com.tokiproducts.toki.project.entity.User;
import com.tokiproducts.toki.project.mapper.UserMapper;
import com.tokiproducts.toki.project.repository.UserRepository;
import com.tokiproducts.toki.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDto savedUser(UserDto newUser) {
        User user = userRepository.save(UserMapper.mapToUser(newUser));
        return UserMapper.mapToUserDto(user);
    }

    @Override
    public boolean authenticateUser(String username, String password) {
        User user = userRepository.findByUsername(username);
        return user != null && user.getPassword().equals(password);
    }
}

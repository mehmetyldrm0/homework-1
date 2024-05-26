package com.tokiproducts.toki.project.repository;

import com.tokiproducts.toki.project.dto.UserDto;
import com.tokiproducts.toki.project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}

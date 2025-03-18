package net.javaguides.springboot.service;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import net.javaguides.springboot.dto.UserDto;
import net.javaguides.springboot.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(@NotEmpty(message = "Email should not be empty") @Email String email);

    List<UserDto> findAllUsers();
}

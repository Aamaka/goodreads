package com.semicolon.goodreads.service;

import com.semicolon.goodreads.dtos.AccountCreation;
import com.semicolon.goodreads.dtos.UserDto;
import com.semicolon.goodreads.models.User;
import com.semicolon.goodreads.repositories.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class UserServiceImplTest {

    @Autowired
    private UserRepository userRepository;
    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserServiceImpl(userRepository);
    }

    @Test
    void testThatUserCanBeCreated(){
        AccountCreation accountCreation =
                new AccountCreation("firstName", "lastname", "fl@gmail,com", "pass");
        UserDto userDto = userService.createUser(accountCreation);
        Optional<User> user = userRepository.findById(userDto.getId());
        assertThat(user.isPresent()).isEqualTo(true);
        assertThat(user.get().getFirstname()).isEqualTo("firstName");
        assertThat(user.get().getLastname()).isEqualTo("lastName");
        assertThat(user.get().getEmail()).isEqualTo("fl@gmail.com");
        assertThat(user.get().getPassword()).isEqualTo("pass");


    }
}
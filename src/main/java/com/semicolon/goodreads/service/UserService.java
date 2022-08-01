package com.semicolon.goodreads.service;

import com.semicolon.goodreads.dtos.AccountCreation;
import com.semicolon.goodreads.dtos.UserDto;

public interface UserService {
    UserDto createUser(AccountCreation accountCreation);

}

package com.semicolon.goodreads.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserDto {

    private long id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
}

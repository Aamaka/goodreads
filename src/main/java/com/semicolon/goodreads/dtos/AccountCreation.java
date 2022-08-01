package com.semicolon.goodreads.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AccountCreation {

    private String firstname;
    private String lastname;
    private String email;
    private String password;
}

package com.semicolon.goodreads.models;
import com.semicolon.goodreads.models.enums.AccountStatus;
import com.semicolon.goodreads.models.enums.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Validated
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    private long id;
    private String firstname;
    private String lastname;
    @Email
    @Column(unique = true)
    private String email;

    private String password;
    private LocalDateTime dob;
    private LocalDateTime dateJoined;
    private LocalDateTime location;
    @Enumerated(value = EnumType.STRING)
    private AccountStatus accountStatus;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;


    public User(String firstname, String lastname, String email, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }
}

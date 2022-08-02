package com.semicolon.goodreads.models;
import com.semicolon.goodreads.models.enums.AccountStatus;
import com.semicolon.goodreads.models.enums.Gender;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Validated
@Getter
@Setter
@Builder
@AllArgsConstructor
public class User {
    public User() {
    }
    @SequenceGenerator(
            name = "user_id_sequence",
            sequenceName = "user_id_sequence"
    )

    @Id
    @Column(name = "user_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @NotBlank
    private String firstname;
    private String lastname;
    @Email
    @Column(unique = true)
    @NotNull
    @NotBlank
    private String email;

    @NotNull
    @NotBlank
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

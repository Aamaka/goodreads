package com.semicolon.goodreads.repositories;

import com.semicolon.goodreads.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

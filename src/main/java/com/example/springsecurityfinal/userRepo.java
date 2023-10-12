package com.example.springsecurityfinal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface userRepo extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String username);

}

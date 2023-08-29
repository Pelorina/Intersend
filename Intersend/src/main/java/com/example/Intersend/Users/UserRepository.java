package com.example.Intersend.Users;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
 Optional<User> findById(Long Id);
 boolean existsByEmail(String email);

}

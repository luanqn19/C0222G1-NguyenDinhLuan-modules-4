package com.example.user.repository;

import com.example.user.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IUserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT * FROM users", nativeQuery = true)
    Page<User> findAll(Pageable pageable);
}

package com.example.book.repository;

import com.example.book.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface IUserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT * FROM users WHERE id_user = :id", nativeQuery = true)
    User detail (@Param("id") Long id);

    void removeByIdUser (@Param("id") Long id);
}

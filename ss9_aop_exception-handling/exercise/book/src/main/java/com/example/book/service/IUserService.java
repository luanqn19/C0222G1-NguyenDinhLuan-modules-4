package com.example.book.service;

import com.example.book.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IUserService {
    void save (User user);

    Page<User> findAll(Pageable pageable);

    User detail (Long id);

    void remove(User user);
}

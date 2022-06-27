package com.example.book.service.impl;

import com.example.book.model.User;
import com.example.book.repository.IUserRepository;
import com.example.book.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public void save (User user) {
        userRepository.save(user);
    }

    @Override
    public Page<User> findAll (Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public User detail (Long id) {
        return userRepository.detail(id);
    }

    @Override
    public void remove (User user) {
        userRepository.removeByIdUser(user.getIdUser());
    }
}

package com.example.user.services;

import com.example.user.model.User;
import com.example.user.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{
    @Autowired
    private IUserRepository userRepository;

    @Override
    public Page<User> findAll (Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public void save (User user) {
        userRepository.save(user);
    }
}

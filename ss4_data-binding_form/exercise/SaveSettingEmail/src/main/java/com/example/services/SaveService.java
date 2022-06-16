package com.example.services;

import com.example.model.Settiing;
import com.example.repository.ISaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveService implements ISaveService {
    @Autowired
    ISaveRepository saveRepository;

    @Override
    public boolean save (Settiing settiing) {
        return saveRepository.save(settiing);
    }
}

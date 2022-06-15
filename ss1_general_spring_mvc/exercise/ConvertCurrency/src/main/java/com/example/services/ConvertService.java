package com.example.services;

import org.springframework.stereotype.Service;

@Service
public class ConvertService implements IConverService{

    @Override
    public int calc (int usdt) {
        return (usdt * 23000);
    }
}

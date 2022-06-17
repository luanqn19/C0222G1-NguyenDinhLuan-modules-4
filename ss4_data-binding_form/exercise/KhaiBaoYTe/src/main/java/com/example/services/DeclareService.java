package com.example.services;

import com.example.model.Declare;
import com.example.repository.IDeclareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeclareService implements IDeclareService {
    @Autowired
    private IDeclareRepository declareRepository;

    @Override
    public void save (Declare declare) {
        declareRepository.save(declare);
    }

    @Override
    public List<Declare> findAll () {
        return declareRepository.findAll();
    }

    @Override
    public String[] findAllGenders () {
        return declareRepository.findAllGenders();
    }

    @Override
    public String[] findAllNations () {
        return declareRepository.findAllNations();
    }
}

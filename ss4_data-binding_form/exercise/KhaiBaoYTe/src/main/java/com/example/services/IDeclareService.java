package com.example.services;

import com.example.model.Declare;

import java.util.List;

public interface IDeclareService {
    void save (Declare declare);

    List<Declare> findAll ();

    String[] findAllGenders();

    String[] findAllNations();
}

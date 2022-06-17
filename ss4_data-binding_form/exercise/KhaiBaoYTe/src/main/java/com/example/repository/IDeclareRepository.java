package com.example.repository;

import com.example.model.Declare;

import java.util.List;

public interface IDeclareRepository {
    void save (Declare declare);

    List<Declare> findAll ();

    String[] findAllGenders();

    String[] findAllNations();
}

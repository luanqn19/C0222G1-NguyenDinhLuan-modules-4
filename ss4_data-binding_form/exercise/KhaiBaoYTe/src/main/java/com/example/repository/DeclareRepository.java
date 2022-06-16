package com.example.repository;

import com.example.model.Declare;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DeclareRepository implements IDeclareRepository {
    private List<Declare> list = new ArrayList<>();

    @Override
    public void save (Declare declare) {
        list.add(declare);
    }

    @Override
    public List<Declare> findAll () {
        return list;
    }
}

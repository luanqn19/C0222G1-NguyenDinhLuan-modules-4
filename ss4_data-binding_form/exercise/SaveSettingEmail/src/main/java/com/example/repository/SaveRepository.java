package com.example.repository;

import com.example.model.Settiing;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SaveRepository implements ISaveRepository {
    private List<Settiing> settiingList = new ArrayList<>();

    @Override
    public boolean save (Settiing settiing) {
        settiingList.add(settiing);
        return true;
    }
}

package com.example.services;

import com.example.model.Catalog;
import com.example.repository.ICatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService implements ICatalogService{
    @Autowired
    private ICatalogRepository catalogRepository;

    @Override
    public List<Catalog> findAll () {
        return catalogRepository.findAll();
    }
}

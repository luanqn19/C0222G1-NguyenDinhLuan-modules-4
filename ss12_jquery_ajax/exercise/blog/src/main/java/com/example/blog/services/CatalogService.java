package com.example.blog.services;

import com.example.blog.model.Catalog;
import com.example.blog.repository.ICatalogRepository;
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

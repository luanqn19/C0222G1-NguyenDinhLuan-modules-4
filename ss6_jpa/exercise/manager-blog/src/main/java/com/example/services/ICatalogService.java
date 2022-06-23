package com.example.services;

import com.example.model.Catalog;

import java.util.List;

public interface ICatalogService {
    List<Catalog> findAll();
}

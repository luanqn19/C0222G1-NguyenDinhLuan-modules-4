package com.example.blog.services;

import com.example.blog.model.Catalog;

import java.util.List;

public interface ICatalogService {
    List<Catalog> findAll();
}

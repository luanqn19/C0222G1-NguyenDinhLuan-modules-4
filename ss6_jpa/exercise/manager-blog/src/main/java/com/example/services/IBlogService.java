package com.example.services;

import com.example.model.Blog;
import com.example.model.Catalog;

import java.util.List;

public interface IBlogService {

    List<Blog> findAll ();

    List<Catalog> findAllCatalog ();

    void save (Blog blog);

    void update (Blog blog);

    void delete (Blog blog);

    List<Blog> search (String name);

    Blog detail (Integer codeProduct);
}

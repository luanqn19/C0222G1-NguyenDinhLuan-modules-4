package com.example.repository;

import com.example.model.Product;

import java.util.List;

public interface IProductRepository {

    List<Product> findAll ();

    void save (Product product);

    void update (Product product);

    void delete (Product product);

    List<Product> search (String name);

    Product detail (Integer codeProduct);
}

package com.example.services;

import com.example.model.Product;

import java.util.List;

public interface IProductService {

    List<Product> findAll ();

    void save (Product product);

    void update (Product product);

    void delete (Product product);

    List<Product> search (String codeProduct);

    Product detail (String codeProduct);
}

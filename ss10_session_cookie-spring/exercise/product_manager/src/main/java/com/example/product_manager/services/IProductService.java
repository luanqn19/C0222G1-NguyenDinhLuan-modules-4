package com.example.product_manager.services;

import com.example.product_manager.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService {
    Page<Product> findAll (Pageable pageable);

    void save (Product product);

    Product detail (Integer codeProduct);

    void delete (Product product);

    Page<Product> search (String name , Pageable pageable);
}

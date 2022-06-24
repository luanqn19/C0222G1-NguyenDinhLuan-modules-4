package com.example.product_manager.services;

import com.example.product_manager.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.example.product_manager.repository.IProductRepository;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public Page<Product> findAll (Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public void save (Product product) {
        productRepository.save(product);
    }

    @Override
    public Product detail (Integer codeProduct) {
        return productRepository.detail(codeProduct);
    }

    @Override
    public void delete (Product product) {
        productRepository.delete(product);
    }

    @Override
    public Page<Product> search (String name, Pageable pageable) {
        return productRepository.search(name, pageable);
    }
}

package com.example.services;

import com.example.model.Product;
import com.example.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> findAll () {
        return productRepository.findAll();
    }

    @Override
    public void save (Product product) {
        productRepository.save(product);
    }

    @Override
    public void update (Product product) {
        productRepository.update(product);
    }

    @Override
    public void delete (Product product) {
        productRepository.delete(product);
    }

    @Override
    public List<Product> search (String name) {
        return productRepository.search(name);
    }

    @Override
    public Product detail (Integer codeProduct) {
        return productRepository.detail(codeProduct);
    }
}

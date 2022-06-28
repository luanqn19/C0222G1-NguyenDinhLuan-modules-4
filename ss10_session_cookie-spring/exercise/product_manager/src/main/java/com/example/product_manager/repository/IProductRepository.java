package com.example.product_manager.repository;

import com.example.product_manager.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IProductRepository extends JpaRepository<Product, Integer> {
    @Query(value = "SELECT * FROM product_managers WHERE code_product = :codeProduct", nativeQuery = true)
    Product detail (@Param("codeProduct") Integer codeProduct);

    @Query(value = "SELECT * FROM product_managers WHERE name_product LIKE :name", nativeQuery = true)
    Page<Product> search (@Param("name") String name , Pageable pageable);
}

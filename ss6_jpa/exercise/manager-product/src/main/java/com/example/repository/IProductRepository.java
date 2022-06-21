package com.example.repository;

import com.example.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
public interface IProductRepository extends JpaRepository<Product, Integer> {
    @Query(value = "SELECT * FROM product p WHERE p.nameProduct LIKE :name", nativeQuery = true)
    List<Product> search(@Param("name") String name);

    @Query(value = "SELECT * FROM product p WHERE p.codeProduct = :codeProduct", nativeQuery = true)
    Product detail (@Param("codeProduct") Integer codeProduct);
}

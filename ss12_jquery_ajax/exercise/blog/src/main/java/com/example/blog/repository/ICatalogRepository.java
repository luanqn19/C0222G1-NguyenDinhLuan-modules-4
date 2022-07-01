package com.example.blog.repository;

import com.example.blog.model.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface ICatalogRepository extends JpaRepository<Catalog, Integer> {

}

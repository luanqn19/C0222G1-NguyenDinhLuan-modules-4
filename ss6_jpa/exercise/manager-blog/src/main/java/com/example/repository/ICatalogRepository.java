package com.example.repository;

import com.example.model.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface ICatalogRepository extends JpaRepository<Catalog, Integer> {

}

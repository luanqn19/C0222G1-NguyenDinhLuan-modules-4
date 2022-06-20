package com.example.repository;

import com.example.model.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    private List<Product> list = new ArrayList<>();

    @Override
    public List<Product> findAll () {
        String hql = "SELECT p FROM Product as p";
        list = BaseRepository.entityManager.createQuery(hql , Product.class).getResultList();
        return list;
    }

    @Override
    public void save (Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(product);
        entityTransaction.commit();
    }

    @Override
    public void update (Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(product);
        entityTransaction.commit();
    }

    @Override
    public void delete (Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.remove(product);
        entityTransaction.commit();
    }

    @Override
    public List<Product> search (String name) {
        String hql = "SELECT p FROM Product AS p WHERE p.nameProduct like :name";
        list = BaseRepository.entityManager.createQuery
                (hql , Product.class).setParameter("name" , "%" + name + "%").getResultList();
        return list;
    }

    @Override
    public Product detail (Integer codeProduct) {
        String hql = "select p from Product p WHERE p.codeProduct = :code";
        Product product = BaseRepository.entityManager.createQuery
                (hql , Product.class).setParameter("code" , codeProduct).getSingleResult();
        return product;
    }
}

package com.example.repository;

import com.example.model.Blog;
import com.example.model.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface IBlogRepository extends JpaRepository<Blog, Integer> {

    @Query(value = "SELECT * FROM blog b WHERE b.titleBlog LIKE :name", nativeQuery = true)
    List<Blog> search (@Param("name") String name);

    @Query(value = "SELECT * FROM blog b WHERE b.idBlog = :idBlog", nativeQuery = true)
    Blog detail (@Param("idBlog") Integer idBlog);
}

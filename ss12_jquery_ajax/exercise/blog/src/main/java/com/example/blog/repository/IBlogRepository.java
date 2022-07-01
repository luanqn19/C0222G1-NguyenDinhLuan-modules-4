package com.example.blog.repository;

import com.example.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface IBlogRepository extends JpaRepository<Blog, Integer> {

    @Query(value = "SELECT * FROM blog", nativeQuery = true)
    Page<Blog> findAll(Pageable pageable);

    @Query(value = "SELECT * FROM blog AS b WHERE b.title_blog LIKE :name", nativeQuery = true)
    Page<Blog> search (Pageable pageable, @Param("name") String name);

    @Query(value = "SELECT * FROM blog AS b WHERE b.id_blog = :idBlog", nativeQuery = true)
    Blog detail (@Param("idBlog") Integer idBlog);

    @Query(value = "SELECT * FROM blog AS b WHERE b.title_blog LIKE :name", nativeQuery = true)
    List<Blog> searchByName (@Param("name") String name);
}

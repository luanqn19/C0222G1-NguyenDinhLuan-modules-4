package com.example.blog.services;

import com.example.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {

    Page<Blog> findAll (Pageable pageable);

    void save (Blog blog);

    void update (Blog blog);

    void delete (Blog blog);

    Page<Blog> search (Pageable pageable, String name);

    Blog detail (Integer codeProduct);
}

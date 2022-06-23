package com.example.services;

import com.example.model.Blog;
import com.example.model.Catalog;
import com.example.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository blogRepository;

    @Override
    public List<Blog> findAll () {
        return blogRepository.findAll();
    }

    @Override
    public void save (Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void update (Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void delete (Blog blog) {
        blogRepository.delete(blog);
    }

    @Override
    public List<Blog> search (String name) {
        return blogRepository.search(name);
    }

    @Override
    public Blog detail (Integer codeProduct) {
        return blogRepository.detail(codeProduct);
    }
}

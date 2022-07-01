package com.example.blog.services;

import com.example.blog.model.Blog;
import com.example.blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository blogRepository;

    @Override
    public Page<Blog> findAll (Pageable pageable) {
        return blogRepository.findAll(pageable);
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
    public Page<Blog> search (Pageable pageable, String name) {
        return blogRepository.search(pageable, name);
    }

    @Override
    public List<Blog> searchByName (String name) {
        return blogRepository.searchByName(name);
    }

    @Override
    public Blog detail (Integer codeProduct) {
        return blogRepository.detail(codeProduct);
    }
}

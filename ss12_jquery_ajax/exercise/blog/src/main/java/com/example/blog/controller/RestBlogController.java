package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.model.Catalog;
import com.example.blog.services.IBlogService;
import com.example.blog.services.ICatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")
public class RestBlogController {
    @Autowired
    private ICatalogService catalogService;

    @Autowired
    private IBlogService blogService;

    @GetMapping(value = "/catalog/list")
    public List<Catalog> showListCatalog () {
        List<Catalog> catalogList = catalogService.findAll();

        return catalogList;
    }

    @GetMapping(value = "/blog/list")
    public List<Blog> showListBlog (@RequestParam(value = "page", defaultValue = "0") int page) {
        Sort sort = Sort.by("date_blog").descending();

        List<Blog> blogs;

        Page<Blog> blogList = blogService.findAll(PageRequest.of(page, 1, sort));
        blogs = blogList.getContent();
        return blogs;
    }

    @GetMapping(value = "/blog/{id}")
    public ResponseEntity<Blog> findBlogById(@PathVariable("id") Integer idBlog) {
        Blog blog = blogService.detail(idBlog);
        if (blog == null) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }

    @GetMapping(value = "/blog/search/{name}")
    public List<Blog> searchBlogByName (@PathVariable("name") String titleBlog) {
        String str = "%" + titleBlog + "%";
        List<Blog> listBlog = blogService.searchByName(str);

        return listBlog;
    }
}

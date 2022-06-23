package com.example.controller;

import com.example.model.Blog;
import com.example.model.Catalog;
import com.example.services.IBlogService;
import com.example.services.ICatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private ICatalogService catalogService;

    @Autowired
    private IBlogService blogService;

    @GetMapping("/")
    public String home () {
        return "/index";
    }

    @GetMapping(value = "/display")
    public String display (Model model) {
        List<Blog> listBlog = blogService.findAll();
        model.addAttribute("listBlog" , listBlog);
        return "/display";
    }

    @GetMapping(value = "/detail/{idBlog}")
    public String detail (@PathVariable("idBlog") Integer idBlog , Model model) {
        Blog blog = blogService.detail(idBlog);
        List<Blog> listBlog = new ArrayList<>();
        listBlog.add(blog);
        model.addAttribute("listBlog" , listBlog);
        return "/display";
    }

    @GetMapping(value = "/create")
    public String showFormCreate (@ModelAttribute("blog") Blog blog , Model model) {
        List<Catalog> catalogList = catalogService.findAll();
        model.addAttribute("catalogList" , catalogList);
        model.addAttribute("blog" , blog);
        return "/create";
    }

    @GetMapping(value = "/edit/{idBlog}")
    public String showFormEdit (@PathVariable("idBlog") Integer idBlog ,
                                @ModelAttribute("blog") Blog blog , Model model) {
        Blog oldBlog = blogService.detail(idBlog);
        model.addAttribute("oldBlog" , oldBlog);
        model.addAttribute("blog" , blog);
        return "/edit";
    }

    @GetMapping(value = "/search")
    public String showFormSearch () {
        return "/search";
    }

    @GetMapping(value = "/delete/{idBlog}")
    public String delete (@PathVariable("idBlog") Integer idBlog , Model model) {
        Blog blog = blogService.detail(idBlog);
        blogService.delete(blog);

        List<Blog> listBlog = blogService.findAll();
        model.addAttribute("listBlog" , listBlog);
        return "/display";
    }

    @PostMapping(value = "/search")
    public String search (@RequestParam("name") String name , Model model) {
        String str = "%" + name + "%";
        List<Blog> listBlog = blogService.search(str);
        model.addAttribute("listBlog" , listBlog);
        return "/display";
    }

    @PostMapping(value = "/save")
    public String save (@ModelAttribute("blog") Blog blog , Model model) {
        blogService.save(blog);
        model.addAttribute("msg" , "Thêm mới sản phẩm thành công");
        return "/create";
    }

    @PostMapping(value = "/edit")
    public String update (@ModelAttribute("product") Blog blog , Model model) {
        blogService.update(blog);

        List<Blog> listBlog = blogService.findAll();
        model.addAttribute("listBlog" , listBlog);
        return "/display";
    }
}

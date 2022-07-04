package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.model.Catalog;
import com.example.blog.services.IBlogService;
import com.example.blog.services.ICatalogService;
import com.example.blog.utils.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;


@Controller
public class BlogController {
    @Autowired
    private ICatalogService catalogService;

    @Autowired
    private IBlogService blogService;

    @GetMapping("/")
    public String home (Model model, Principal principal) {
        // Sau khi user login thanh cong se co principal
        if (principal != null) {
            String userName = principal.getName();

            System.out.println("User Name: " + userName);

            User loginedUser = (User) ((Authentication) principal).getPrincipal();

            System.out.println("Login User: " + loginedUser);

            String userInfo = WebUtils.toString(loginedUser);
            model.addAttribute("userInfo", userInfo);
            return "/index";
        }
        return "/index";
    }

    @GetMapping(value = "/display")
    public String display (@RequestParam(name = "page", defaultValue = "0") int page , Model model) {
        Sort sort = Sort.by("date_blog").descending();
        Page<Blog> listBlog = blogService.findAll(PageRequest.of(page , 2, sort));
        model.addAttribute("listBlog" , listBlog);
        return "display";
    }

    @GetMapping(value = "/read")
    public String readBlog (@RequestParam(name = "page", defaultValue = "0") int page , Model model) {
        Sort sort = Sort.by("date_blog").descending();
        Page<Blog> listBlog = blogService.findAll(PageRequest.of(page , 1, sort));
        model.addAttribute("listBlog" , listBlog);
        model.addAttribute("page", page);
        return "detail";
    }

    @GetMapping(value = "/detail/{idBlog}")
    public String detail (@PathVariable("idBlog") Integer idBlog , Model model) {
        Blog blog = blogService.detail(idBlog);
        model.addAttribute("blog" , blog);
        return "detail";
    }

    @GetMapping(value = "/create")
    public String showFormCreate (@ModelAttribute("blog") Blog blog , Model model) {
        List<Catalog> catalogList = catalogService.findAll();
        model.addAttribute("catalogList" , catalogList);
        model.addAttribute("blog" , blog);
        return "create";
    }

    @GetMapping(value = "/edit/{idBlog}")
    public String showFormEdit (@PathVariable("idBlog") Integer idBlog ,
                                @ModelAttribute("blog") Blog blog , Model model) {
        Blog oldBlog = blogService.detail(idBlog);
        List<Catalog> catalogList = catalogService.findAll();
        model.addAttribute("catalogList" , catalogList);
        model.addAttribute("oldBlog" , oldBlog);
        model.addAttribute("blog" , blog);
        return "edit";
    }

    @GetMapping(value = "/search")
    public String showFormSearch () {
        return "search";
    }

    @GetMapping(value = "/delete/{idBlog}")
    public String delete (@RequestParam(name = "page", defaultValue = "0") int page ,
                          @PathVariable("idBlog") Integer idBlog , Model model) {
        Blog blog = blogService.detail(idBlog);
        blogService.delete(blog);

        Page<Blog> listBlog = blogService.findAll(PageRequest.of(page , 2));
        model.addAttribute("listBlog" , listBlog);
        return "display";
    }

    @PostMapping(value = "/search")
    public String search (@RequestParam(name = "page", defaultValue = "0") int page ,
                          @RequestParam("name") String name , Model model) {
        String str = "%" + name + "%";
        Page<Blog> listBlog = blogService.search(PageRequest.of(page , 2) , str);
        model.addAttribute("listBlog" , listBlog);
        return "display";
    }

    @PostMapping(value = "/save")
    public String save (@Valid @ModelAttribute("blog") Blog blog, BindingResult result, Model model) {
        List<Catalog> catalogList = catalogService.findAll();

        if (result.hasErrors()) {
            model.addAttribute("catalogList" , catalogList);
            return "create";
        }
        blogService.save(blog);
        model.addAttribute("msg" , "Thêm mới sản phẩm thành công");
        return "create";
    }

    @PostMapping(value = "/edit")
    public String update (@RequestParam(name = "page", defaultValue = "0") int page ,
                          @ModelAttribute("product") Blog blog , Model model) {
        blogService.update(blog);

        Page<Blog> listBlog = blogService.findAll(PageRequest.of(page , 2));
        model.addAttribute("listBlog" , listBlog);
        return "display";
    }

    @GetMapping(value = "/logoutSuccessful")
    public String logoutSuccessfulPage() {
        return "logoutSuccessfulPage";
    }
}

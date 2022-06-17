package com.example.controller;

import com.example.model.Product;
import com.example.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/")
    public String home () {
        return "/index";
    }

    @GetMapping(value = "/display")
    public String display (Model model) {
        List<Product> listProduct = productService.findAll();
        model.addAttribute("listProduct" , listProduct);
        return "/display";
    }

    @GetMapping(value = "/detail/{codeProduct}")
    public String detail (@PathVariable("codeProduct") String codeProduct , Model model) {
        Product product = productService.detail(codeProduct);
        List<Product> listProduct = new ArrayList<>();
        listProduct.add(product);
        model.addAttribute("listProduct" , listProduct);
        return "/display";
    }

    @GetMapping(value = "/create")
    public String showFormCreate (@ModelAttribute("product") Product product , Model model) {
        model.addAttribute("product" , product);
        return "/create";
    }

    @GetMapping(value = "/edit/{codeProduct}")
    public String showFormEdit (@PathVariable("codeProduct") String codeProduct ,
                                @ModelAttribute("product") Product product , Model model) {
        Product oldProduct = productService.detail(codeProduct);
        model.addAttribute("oldProduct" , oldProduct);
        model.addAttribute("product" , product);
        return "/edit";
    }

    @GetMapping(value = "/search")
    public String showFormSearch () {
        return "/search";
    }

    @GetMapping(value = "/delete/{codeProduct}")
    public String delete (@PathVariable("codeProduct") String codeProduct , Model model) {
        Product product = productService.detail(codeProduct);
        productService.delete(product);

        List<Product> listProduct = productService.findAll();
        model.addAttribute("listProduct" , listProduct);
        return "/display";
    }

    @PostMapping(value = "/search")
    public String search (@RequestParam("name") String name , Model model) {
        List<Product> listProduct = productService.search(name);
        model.addAttribute("listProduct" , listProduct);
        return "/display";
    }

    @PostMapping(value = "/save")
    public String save (@ModelAttribute("product") Product product , Model model) {
        productService.save(product);
        model.addAttribute("msg" , "Thêm mới sản phẩm thành công");
        return "/create";
    }

    @PostMapping(value = "/edit")
    public String update (@ModelAttribute("product") Product product , Model model) {
        productService.update(product);

        List<Product> listProduct = productService.findAll();
        model.addAttribute("listProduct" , listProduct);
        return "/display";
    }
}

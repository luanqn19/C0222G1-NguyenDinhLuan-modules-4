package com.example.product_manager.controller;

import com.example.product_manager.model.Product;
import com.example.product_manager.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/")
    public String home () {
        return "index";
    }

    @GetMapping(value = "/display")
    public String display (@RequestParam(value = "page", defaultValue = "0") int page , Model model) {
        Page<Product> listProduct = productService.findAll(PageRequest.of(page , 2));
        model.addAttribute("listProduct" , listProduct);
        return "display";
    }

    @GetMapping(value = "/detail/{codeProduct}")
    public String detail (@PathVariable("codeProduct") Integer codeProduct , Model model) {
        Product product = productService.detail(codeProduct);
        model.addAttribute("product" , product);
        return "detail";
    }

    @GetMapping(value = "/create")
    public String showFormCreate (@ModelAttribute("product") Product product , Model model) {
        model.addAttribute("product" , product);
        return "create";
    }

    @GetMapping(value = "/edit/{codeProduct}")
    public String showFormEdit (@PathVariable("codeProduct") Integer codeProduct , Model model) {
        Product product = productService.detail(codeProduct);
        model.addAttribute("product" , product);
        return "edit";
    }

    @GetMapping(value = "/delete/{codeProduct}")
    public String delete (@RequestParam(value = "page", defaultValue = "0") int page ,
                          @PathVariable("codeProduct") Integer codeProduct , Model model) {
        Product product = productService.detail(codeProduct);
        productService.delete(product);

        Page<Product> listProduct = productService.findAll(PageRequest.of(page , 2));
        model.addAttribute("listProduct" , listProduct);
        return "/display";
    }

    @PostMapping(value = "/search")
    public String search (@RequestParam(value = "page", defaultValue = "0") int page ,
                          @RequestParam("name") String name , Model model) {
        String str = "%" + name + "%";
        Page<Product> listProduct = productService.search(str , PageRequest.of(page , 2));
        model.addAttribute("listProduct" , listProduct);
        return "/display";
    }

    @PostMapping(value = "/save")
    public String save (@Valid @ModelAttribute("product") Product product , BindingResult result , Model model) {
        if (result.hasErrors()) return "create";

        productService.save(product);
        model.addAttribute("msg" , "Thêm mới sản phẩm thành công");
        return "create";
    }

    @PostMapping(value = "/edit")
    public String update (@Valid @ModelAttribute("product") Product product , BindingResult result , Model model) {
        if (result.hasErrors()) return "edit";

        productService.save(product);
        model.addAttribute("msg" , "Update sản phẩm thành công");
        return "edit";
    }
}

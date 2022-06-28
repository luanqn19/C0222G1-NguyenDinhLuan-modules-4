package com.example.product_manager.controller;

import com.example.product_manager.model.CartItem;
import com.example.product_manager.model.Product;
import com.example.product_manager.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Controller
@SessionAttributes("productCartList")
public class ProductController {

    @ModelAttribute("productCartList")
    public CartItem createCart () {
        return new CartItem();
    }

    @GetMapping(value = "/add-product/{id}")
    public String addToCart (@PathVariable("id") Integer codeProduct ,
                             @ModelAttribute("productCartList") CartItem cartList ,
                             @RequestParam("action") String action ,
                             RedirectAttributes redirectAttributes) {
        Product product = productService.detail(codeProduct);
        if (action.equals("decrement")) {
            cartList.decrementProduct(product);
            return "redirect:/shopping-cart";
        } else if (action.equals("increment")) {
            cartList.addProduct(product);
            return "redirect:/shopping-cart";
        } else if (action.equals("delete")) {
            cartList.deleteProduct(product);
            return "redirect:/shopping-cart";
        } else {
            cartList.addProduct(product);
            redirectAttributes.addFlashAttribute("msg" , "Thêm sản phẩm " + product.getNameProduct() + " vào giỏ hàng thành công");
            return "redirect:/display";
        }
    }


    @Autowired
    private IProductService productService;

    @GetMapping("/")
    public String home () {
        return "index";
    }

    @GetMapping(value = "/display")
    public String display (@RequestParam(value = "page", defaultValue = "0") int page , Model model) {
        Page<Product> listProduct = productService.findAll(PageRequest.of(page , 5));
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

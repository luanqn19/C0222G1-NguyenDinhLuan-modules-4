package com.example.product_manager.controller;

import com.example.product_manager.model.CartItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductCartController {
    @ModelAttribute("productCartList")
    public CartItem setupCart () {
        return new CartItem();
    }

    @GetMapping(value = "/shopping-cart")
    public ModelAndView listCartProduct (@SessionAttribute("productCartList") CartItem cartList , Model model) {
        ModelAndView modelAndView = new ModelAndView("/list-cart-product");
        modelAndView.addObject("cartList" , cartList);
        return modelAndView;
    }
}

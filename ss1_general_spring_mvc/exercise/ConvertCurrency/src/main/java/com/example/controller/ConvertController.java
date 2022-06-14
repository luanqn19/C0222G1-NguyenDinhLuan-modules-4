package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @GetMapping("/currency")
    public String convertCur(@RequestParam("usdt") int usdt, Model model) {
        System.out.println(usdt);
        int vnd = usdt * 23000;
        model.addAttribute("vnd", vnd);
        model.addAttribute("usdt", usdt);
        return "convert";
    }
}

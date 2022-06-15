package com.example.controller;

import com.example.services.IConverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @Autowired
    IConverService converService;

    @GetMapping("/currency")
    public String convertCur(@RequestParam("usdt") int usdt, Model model) {
        int vnd = converService.calc(usdt);
        model.addAttribute("vnd", vnd);
        model.addAttribute("usdt", usdt);
        return "convert";
    }
}

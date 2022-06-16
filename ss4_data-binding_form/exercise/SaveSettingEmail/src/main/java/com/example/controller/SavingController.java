package com.example.controller;

import com.example.model.Settiing;
import com.example.services.ISaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SavingController {
    @Autowired
    ISaveService saveService;

    @GetMapping("/save")
    public String saveSetting (@ModelAttribute("setting") Settiing settiing , Model model) {
        model.addAttribute("settiing" , settiing);
        int[] pageSize = new int[]{5 , 10 , 15 , 25 , 50 , 100};
        String[] language = new String[]{"English" , "Vietnamese" , "Japanese" , "Chinese"};
        model.addAttribute("listLang" , language);
        model.addAttribute("listPageSize" , pageSize);
        return "show-form";
    }

    @PostMapping("/save")
    public String save (@ModelAttribute("setting") Settiing settiing , Model model) {
        if (saveService.save(settiing)) {
            model.addAttribute("msg" , "Thêm mới thành công");
            return "show-form";
        } else {
            model.addAttribute("msg" , "Thêm mới không thành công");
            return "show-form";
        }
    }
}

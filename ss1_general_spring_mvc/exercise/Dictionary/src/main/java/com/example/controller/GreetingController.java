package com.example.controller;

import com.example.services.Dictionary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class GreetingController {
    @GetMapping("/")
    public String greeting() {
        return "home";
    }


    @GetMapping("/find")
    public String greeting(@RequestParam("word") String word, Model model) {
        boolean flag = false;
        for (Map.Entry<String, String> item : Dictionary.dic.entrySet()) {
            if (item.getKey().equalsIgnoreCase(word)) {
                flag = true;
                model.addAttribute("name", item.getKey());
                model.addAttribute("value", item.getValue());
                break;
            }
        }

        if (!flag) {
            model.addAttribute("name", "Từ cần tìm kiếm không có");
        }
        return "search";
    }
}

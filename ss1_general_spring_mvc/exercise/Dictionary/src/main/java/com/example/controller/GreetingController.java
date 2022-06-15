package com.example.controller;

import com.example.model.Word;
import com.example.services.DictionaryService;
import com.example.services.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {
    @Autowired
    IDictionaryService dictionaryService;

    @GetMapping("/")
    public String greeting() {
        return "home";
    }


    @GetMapping("/find")
    public String greeting(@RequestParam("word") String word, Model model) {
        Word keyWord = dictionaryService.find(word);
        if (keyWord != null) {
            model.addAttribute("name", keyWord.getEnWord());
            model.addAttribute("value", keyWord.getVnWord());
        } else {
            model.addAttribute("name", "Từ cần tìm kiếm không có");
        }
        return "search";
    }
}

package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class CondimentsController {
    @RequestMapping("/save")
    public String save(@RequestParam(value = "condiment", defaultValue = "") String[] condiment, Model model) {
        if (condiment.length == 0) return "show";
        model.addAttribute("condiment",condiment);
        for (String item: condiment) {
            switch ( item ) {
                case "Lettuce":
                    model.addAttribute("Lettuce","checked");
                    break;
                case "Tomato":
                    model.addAttribute("Tomato","checked");
                    break;
                case "Mustard":
                    model.addAttribute("Mustard","checked");
                    break;
                case "Sprouts":
                    model.addAttribute("Sprouts","checked");
                    break;
            }
        }
        return "show";
    }
}

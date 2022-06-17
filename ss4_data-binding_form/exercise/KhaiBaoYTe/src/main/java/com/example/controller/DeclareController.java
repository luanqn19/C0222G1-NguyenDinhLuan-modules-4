package com.example.controller;

import com.example.model.Declare;
import com.example.services.IDeclareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DeclareController {
    @Autowired
    private IDeclareService declareService;

    @GetMapping("/declare")
    public String showDeclare (@ModelAttribute("declare") Declare declare , Model model) {
        model.addAttribute("declare" , declare);
        String[] genders = declareService.findAllGenders();
        String[] nations = declareService.findAllNations();
        model.addAttribute("genders" , genders);
        model.addAttribute("nations" , nations);
        return "show-form";
    }

    @GetMapping("/display")
    public String showList (Model model) {
        List<Declare> list = declareService.findAll();
        model.addAttribute("list" , list);
        return "display";
    }

    @PostMapping("/save")
    public String saveDeclare (@ModelAttribute("declare") Declare declare , Model model) {
        declareService.save(declare);
        model.addAttribute("msg" , "Lưu khai báo thành công");
        return "show-form";
    }

}

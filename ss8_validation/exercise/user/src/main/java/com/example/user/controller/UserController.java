package com.example.user.controller;

import com.example.user.model.User;
import com.example.user.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/display")
    public String list(@RequestParam(value = "page", defaultValue = "0") int page, Model model) {
        model.addAttribute("listUsers", userService.findAll(PageRequest.of(page, 2)));
        return "display";
    }

    @GetMapping("/create")
    public String showFormCreate(@ModelAttribute("user") User user, Model model) {
        model.addAttribute("user", user);
        return "create";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("user") User user, BindingResult result , Model model) {
        if (result.hasErrors()) return "create";

        userService.save(user);
        model.addAttribute("msg" , "Thêm mới người dùng thành công");
        return "create";
    }
}

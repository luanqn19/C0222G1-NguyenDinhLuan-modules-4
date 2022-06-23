package com.example.music.controller;

import com.example.music.model.Music;
import com.example.music.services.IMusicService;
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
public class MusicController {
    @Autowired
    private IMusicService musicService;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/display")
    public String list(@RequestParam(value = "page", defaultValue = "0") int page, Model model) {
        model.addAttribute("listMusic", musicService.findAll(PageRequest.of(page, 2)));
        return "display";
    }

    @GetMapping("/create")
    public String showFormCreate(@ModelAttribute("music") Music music, Model model) {
        model.addAttribute("music", music);
        return "create";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("music") Music music, BindingResult result , Model model) {
        if (result.hasErrors()) return "create";

        musicService.save(music);
        model.addAttribute("msg" , "Thêm mới bài hát mới thành công");
        return "create";
    }
}

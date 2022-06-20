package com.example.controller;

import com.example.model.AudioFile;
import com.example.services.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MusicController {
    @Autowired
    private IMusicService musicService;

    @GetMapping("/")
    public String home () {
        return "/index";
    }

    @GetMapping(value = "/display")
    public String display (Model model) {
        List<AudioFile> listAudioFile = musicService.findAll();
        model.addAttribute("listAudioFile" , listAudioFile);
        return "/display";
    }

//    @GetMapping(value = "/detail/{codeProduct}")
//    public String detail (@PathVariable("codeProduct") Integer codeProduct , Model model) {
//        AudioFile audioFile = musicService.detail(codeProduct);
//        List<AudioFile> listAudioFile = new ArrayList<>();
//        listAudioFile.add(audioFile);
//        model.addAttribute("listProduct" , listAudioFile);
//        return "/display";
//    }
//
//    @GetMapping(value = "/create")
//    public String showFormCreate (@ModelAttribute("product") AudioFile audioFile , Model model) {
//        model.addAttribute("product" , audioFile);
//        return "/create";
//    }
//
//    @GetMapping(value = "/edit/{codeProduct}")
//    public String showFormEdit (@PathVariable("codeProduct") Integer codeProduct ,
//                                @ModelAttribute("product") AudioFile audioFile , Model model) {
//        AudioFile oldAudioFile = musicService.detail(codeProduct);
//        model.addAttribute("oldProduct" , oldAudioFile);
//        model.addAttribute("product" , audioFile);
//        return "/edit";
//    }
//
//    @GetMapping(value = "/search")
//    public String showFormSearch () {
//        return "/search";
//    }
//
//    @GetMapping(value = "/delete/{codeProduct}")
//    public String delete (@PathVariable("codeProduct") Integer codeProduct , Model model) {
//        AudioFile audioFile = musicService.detail(codeProduct);
//        musicService.delete(audioFile);
//
//        List<AudioFile> listAudioFile = musicService.findAll();
//        model.addAttribute("listProduct" , listAudioFile);
//        return "/display";
//    }
//
//    @PostMapping(value = "/search")
//    public String search (@RequestParam("name") String name , Model model) {
//        List<AudioFile> listAudioFile = musicService.search(name);
//        model.addAttribute("listProduct" , listAudioFile);
//        return "/display";
//    }
//
//    @PostMapping(value = "/save")
//    public String save (@ModelAttribute("product") AudioFile audioFile , Model model) {
//        musicService.save(audioFile);
//        model.addAttribute("msg" , "Thêm mới sản phẩm thành công");
//        return "/create";
//    }
//
//    @PostMapping(value = "/edit")
//    public String update (@ModelAttribute("product") AudioFile audioFile , Model model) {
//        musicService.update(audioFile);
//
//        List<AudioFile> listAudioFile = musicService.findAll();
//        model.addAttribute("listProduct" , listAudioFile);
//        return "/display";
//    }
}

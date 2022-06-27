package com.example.book.controller;

import com.example.book.model.Book;
import com.example.book.model.User;
import com.example.book.service.IBookService;
import com.example.book.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {
    @Autowired
    private IBookService bookService;
    @Autowired
    private IUserService userService;

    @GetMapping("/")
    public String home () {
        return "index";
    }

    @GetMapping("/book/display")
    public String showListBook (@RequestParam(value = "page", defaultValue = "0") int page , Model model) {
        Page<Book> bookList = bookService.findAll(PageRequest.of(page , 2));
        model.addAttribute("bookList" , bookList);
        return "display-book";
    }

    @GetMapping("/users/display")
    public String showListUser (@RequestParam(value = "page", defaultValue = "0") int page , Model model) {
        Page<User> listUser = userService.findAll(PageRequest.of(page , 2));
        model.addAttribute("listUser" , listUser);
        return "display-user";
    }

    @GetMapping("/borrow/{idBook}")
    public String showFormBorrow (@RequestParam(value = "page", defaultValue = "0") int page ,
                                  @ModelAttribute("user") User user , @PathVariable("idBook") Long idBook , Model model) {
        Book book = bookService.detail(idBook);
        if (book.getAmount() == 0) {
            Page<Book> bookList = bookService.findAll(PageRequest.of(page , 2));
            model.addAttribute("bookList" , bookList);
            model.addAttribute("msg" , "Sách '" + book.getTitle() + "' trong kho đã hết vui lòng quay lại sau!");
            return "display-book";
        }

        Long idUser = (long) Math.floor((Math.random() * 89999) + 10000);
        user.setIdUser(idUser);
        user.setBook(book);
        model.addAttribute("book" , book);
        model.addAttribute("user" , user);
        return "borrow-book";
    }

    @PostMapping("/save-user")
    public String borrow (@ModelAttribute("user") User user , Model model , @RequestParam(value = "page", defaultValue = "0") int page) {
        Book book = bookService.detail(user.getBook().getIdBook());
        book.setAmount(book.getAmount() - 1);
        bookService.save(book);
        userService.save(user);

        Page<Book> bookList = bookService.findAll(PageRequest.of(page , 2));
        model.addAttribute("bookList" , bookList);
        return "display-book";
    }

    @GetMapping("/give/{idUser}")
    public String giveBook (@PathVariable("idUser") Long idUser , @RequestParam(value = "page", defaultValue = "0") int page ,
                            Model model) {
        User user = userService.detail(idUser);
        Book book = bookService.detail(user.getBook().getIdBook());
        book.setAmount(book.getAmount() + 1);
        bookService.save(book);
        userService.remove(user);

        Page<User> listUser = userService.findAll(PageRequest.of(page , 2));
        model.addAttribute("listUser" , listUser);
        return "display-user";
    }
}

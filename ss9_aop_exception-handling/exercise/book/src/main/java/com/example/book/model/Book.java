package com.example.book.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idBook;

    private String title;

    private String author;

    private Integer amount;

    @OneToMany(mappedBy = "book")
    private List<User> userList;

    public Book () {
    }

    public Book (Long idBook , String title , String author , Integer amount) {
        this.idBook = idBook;
        this.title = title;
        this.author = author;
        this.amount = amount;
    }

    public Long getIdBook () {
        return idBook;
    }

    public void setIdBook (Long idBook) {
        this.idBook = idBook;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public String getAuthor () {
        return author;
    }

    public void setAuthor (String author) {
        this.author = author;
    }

    public Integer getAmount () {
        return amount;
    }

    public void setAmount (Integer amount) {
        this.amount = amount;
    }

    public List<User> getUserList () {
        return userList;
    }

    public void setUserList (List<User> userList) {
        this.userList = userList;
    }
}

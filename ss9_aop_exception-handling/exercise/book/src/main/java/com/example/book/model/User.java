package com.example.book.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "users")
public class User {
    @Id
    private Long idUser;
    private String nameUser;

    @ManyToOne
    @JoinColumn(name = "idBook")
    private Book book;

    public User () {
    }

    public User (Long idUser , String nameUser) {
        this.idUser = idUser;
        this.nameUser = nameUser;
    }

    public Long getIdUser () {
        return idUser;
    }

    public void setIdUser (Long idUser) {
        this.idUser = idUser;
    }

    public String getNameUser () {
        return nameUser;
    }

    public void setNameUser (String nameUser) {
        this.nameUser = nameUser;
    }

    public Book getBook () {
        return book;
    }

    public void setBook (Book book) {
        this.book = book;
    }
}

package com.example.blog.model;

import com.example.blog.utils.annotation.NameConstraint;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBlog;

    @NameConstraint
    @NotEmpty(message = "Tên tiêu đề không được để trống")
    private String titleBlog;

    @NameConstraint(message = "Tên tác giả không đúng định dạng")
    @NotEmpty(message = "Tên tác giả không được để trống")
    private String artistBlog;

    @NameConstraint(message = "Thể loại không đúng định dạng")
    @NotEmpty(message = "Thể loại không được để trống")
    private String typeOfBlog;

    @NotEmpty(message = "Nội dung không được để trống")
    private String contentBlog;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateBlog;

    @ManyToOne
    @JoinColumn(name = "idCatalog")
    private Catalog catalog;

    public Blog () {
    }

    public Blog (Integer idBlog , String titleBlog , String artistBlog ,
                 String typeOfBlog , String contentBlog , Date dateBlog) {
        this.idBlog = idBlog;
        this.titleBlog = titleBlog;
        this.artistBlog = artistBlog;
        this.typeOfBlog = typeOfBlog;
        this.contentBlog = contentBlog;
        this.dateBlog = dateBlog;
    }

    public Integer getIdBlog () {
        return idBlog;
    }

    public void setIdBlog (Integer idBlog) {
        this.idBlog = idBlog;
    }

    public String getTitleBlog () {
        return titleBlog;
    }

    public void setTitleBlog (String titleBlog) {
        this.titleBlog = titleBlog;
    }

    public String getArtistBlog () {
        return artistBlog;
    }

    public void setArtistBlog (String artistBlog) {
        this.artistBlog = artistBlog;
    }

    public String getTypeOfBlog () {
        return typeOfBlog;
    }

    public void setTypeOfBlog (String typeOfBlog) {
        this.typeOfBlog = typeOfBlog;
    }

    public String getContentBlog () {
        return contentBlog;
    }

    public void setContentBlog (String contentBlog) {
        this.contentBlog = contentBlog;
    }

    public Date getDateBlog () {
        return dateBlog;
    }

    public void setDateBlog (Date dateBlog) {
        this.dateBlog = dateBlog;
    }

    public Catalog getCatalog () {
        return catalog;
    }

    public void setCatalog (Catalog catalog) {
        this.catalog = catalog;
    }

//    @Override
//    public boolean supports (Class<?> clazz) {
//        return false;
//    }
//
//    @Override
//    public void validate (Object target , Errors errors) {
//        Blog blog = (Blog) target;
//        if (!blog.titleBlog.matches("^([A-Za-z]\\s*?)+$")) {
//            errors.reject("titleBlog", "titleBlog.invalidFormat");
//        }
//    }
}

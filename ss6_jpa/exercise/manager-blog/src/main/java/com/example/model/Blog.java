package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBlog;
    private String titleBlog;
    private String artistBlog;
    private String typeOfBlog;
    private String contentBlog;
    private String dateBlog;
    @ManyToOne
    @JoinColumn(name = "idCatalog")
    private Catalog catalog;

    public Blog () {
    }

    public Blog (Integer idBlog , String titleBlog , String artistBlog ,
                 String typeOfBlog , String contentBlog , String dateBlog) {
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

    public String getDateBlog () {
        return dateBlog;
    }

    public void setDateBlog (String dateBlog) {
        this.dateBlog = dateBlog;
    }

    public Catalog getCatalog () {
        return catalog;
    }

    public void setCatalog (Catalog catalog) {
        this.catalog = catalog;
    }
}

package com.example.blog.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Catalog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCatalog;
    private String typeCatalog;

    @OneToMany(mappedBy = "catalog")
    @JsonManagedReference
    private List<Blog> blogList;

    public Catalog () {
    }

    public Catalog (Integer idCatalog , String typeCatalog) {
        this.idCatalog = idCatalog;
        this.typeCatalog = typeCatalog;
    }

    public Integer getIdCatalog () {
        return idCatalog;
    }

    public void setIdCatalog (Integer idCatalog) {
        this.idCatalog = idCatalog;
    }

    public String getTypeCatalog () {
        return typeCatalog;
    }

    public void setTypeCatalog (String typeCatalog) {
        this.typeCatalog = typeCatalog;
    }

    public List<Blog> getBlogList () {
        return blogList;
    }

    public void setBlogList (List<Blog> blogList) {
        this.blogList = blogList;
    }
}

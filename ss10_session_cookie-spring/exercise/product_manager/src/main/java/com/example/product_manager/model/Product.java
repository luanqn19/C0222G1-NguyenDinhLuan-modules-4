package com.example.product_manager.model;

import com.example.product_manager.utils.annotation.NameConstraint;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.Objects;

@Entity(name = "product_managers")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codeProduct;

    @NameConstraint(message = "Tên sản phẩm không đúng định dang!")
    @NotBlank(message = "Tên sản phẩm không được để trống!")
    private String nameProduct;

    @NameConstraint(message = "Tên nhà sản xuất không đúng định dang!")
    @NotBlank(message = "Tên nhà sản xuất không được để trống!")
    private String nameProduction;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateImport;

    @Min(value = 0, message = "Giá sản phẩm phải lớn hơn 0")
    private Double priceProduct;

    @Min(value = 0, message = "Số lượng sản phẩm phải lớn hơn 0")
    private Integer amountProduct;

    private String linkImage;

    public Product () {
    }

    public Product (Integer codeProduct , String nameProduct , String nameProduction ,
                    Date dateImport , Double priceProduct , Integer amountProduct , String linkImage) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.nameProduction = nameProduction;
        this.dateImport = dateImport;
        this.priceProduct = priceProduct;
        this.amountProduct = amountProduct;
        this.linkImage = linkImage;
    }

    public String getLinkImage () {
        return linkImage;
    }

    public void setLinkImage (String linkImage) {
        this.linkImage = linkImage;
    }

    public Integer getCodeProduct () {
        return codeProduct;
    }

    public void setCodeProduct (Integer codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct () {
        return nameProduct;
    }

    public void setNameProduct (String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNameProduction () {
        return nameProduction;
    }

    public void setNameProduction (String nameProduction) {
        this.nameProduction = nameProduction;
    }

    public Date getDateImport () {
        return dateImport;
    }

    public void setDateImport (Date dateImport) {
        this.dateImport = dateImport;
    }

    public Double getPriceProduct () {
        return priceProduct;
    }

    public void setPriceProduct (Double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public Integer getAmountProduct () {
        return amountProduct;
    }

    public void setAmountProduct (Integer amountProduct) {
        this.amountProduct = amountProduct;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (! (o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(getCodeProduct() , product.getCodeProduct());
    }

    @Override
    public int hashCode () {
        return Objects.hash(getCodeProduct());
    }
}

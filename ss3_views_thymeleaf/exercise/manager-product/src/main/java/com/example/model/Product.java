package com.example.model;

public class Product {
    private String codeProduct;
    private String nameProduct;
    private String nameProduction;
    private String dateImport;
    private Double priceProduct;
    private Integer amountProduct;

    public Product () {
    }

    public Product (String codeProduct , String nameProduct , String nameProduction , String dateImport , Double priceProduct , Integer amountProduct) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.nameProduction = nameProduction;
        this.dateImport = dateImport;
        this.priceProduct = priceProduct;
        this.amountProduct = amountProduct;
    }

    public String getCodeProduct () {
        return codeProduct;
    }

    public void setCodeProduct (String codeProduct) {
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

    public String getDateImport () {
        return dateImport;
    }

    public void setDateImport (String dateImport) {
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
}

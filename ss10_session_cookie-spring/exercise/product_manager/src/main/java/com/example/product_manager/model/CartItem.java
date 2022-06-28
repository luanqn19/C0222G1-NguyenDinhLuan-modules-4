package com.example.product_manager.model;

import java.util.HashMap;
import java.util.Map;

public class CartItem {
    private Map<Product, Integer> listProduct = new HashMap<>();

    public CartItem () {
    }

    public CartItem (Map<Product, Integer> listProduct) {
        this.listProduct = listProduct;
    }

    public Map<Product, Integer> getListProduct () {
        return listProduct;
    }

    public void setListProduct (Map<Product, Integer> listProduct) {
        this.listProduct = listProduct;
    }

    private boolean checkItemInCart (Product product) {
        for (Map.Entry<Product, Integer> entry : listProduct.entrySet()) {
            if (entry.getKey().getCodeProduct().equals(product.getCodeProduct())) {
                return true;
            }
        }
        return false;
    }

    private Map.Entry<Product, Integer> selectItemInCart (Product product) {
        for (Map.Entry<Product, Integer> entry : listProduct.entrySet()) {
            if (entry.getKey().getCodeProduct().equals(product.getCodeProduct())) {
                return entry;
            }
        }
        return null;
    }

    public void addProduct (Product product) {
        if (! checkItemInCart(product)) {
            listProduct.put(product , 1);
        } else {
            Map.Entry<Product, Integer> itemEntry = selectItemInCart(product);
            Integer newQuantity = itemEntry.getValue() + 1;
            listProduct.replace(itemEntry.getKey() , newQuantity);
        }
    }

    public void decrementProduct (Product product) {
        if (! checkItemInCart(product)) {
            listProduct.put(product , 1);
        } else {
            Map.Entry<Product, Integer> itemEntry = selectItemInCart(product);
            if (itemEntry.getValue() == 0) {
                listProduct.remove(itemEntry.getKey());
            }
            Integer newQuantity = itemEntry.getValue() - 1;
            listProduct.replace(itemEntry.getKey() , newQuantity);
        }
    }

    public void deleteProduct (Product product) {
        Map.Entry<Product, Integer> itemEntry = selectItemInCart(product);
        listProduct.remove(itemEntry.getKey());
    }

    public Integer countProductQuantity () {
        Integer productQuantity = 0;
        for (Map.Entry<Product, Integer> entry : listProduct.entrySet()) {
            productQuantity += entry.getValue();
        }
        return productQuantity;
    }

    public Integer countItemQuantity () {
        return listProduct.size();
    }

    public Float countTotalPayment () {
        float payment = 0;
        for (Map.Entry<Product, Integer> entry : listProduct.entrySet()) {
            payment += entry.getKey().getPriceProduct() * (float) entry.getValue();
        }
        return payment;
    }
}

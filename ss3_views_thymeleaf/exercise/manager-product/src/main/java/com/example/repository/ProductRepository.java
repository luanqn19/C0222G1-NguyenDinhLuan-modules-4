package com.example.repository;

import com.example.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    private List<Product> list = new ArrayList<>();

    public ProductRepository () {
        list.add(new Product("SP001" , "Iphone 7" , "Apple" , "2022-06-17" , 4000000.0 , 15));
        list.add(new Product("SP002" , "Iphone 7 Plus" , "Apple" , "2022-06-17" , 5000000.0 , 15));
        list.add(new Product("SP003" , "Iphone 8 Plus" , "Apple" , "2022-06-17" , 5400000.0 , 15));
        list.add(new Product("SP004" , "Iphone X" , "Apple" , "2022-06-17" , 7400000.0 , 15));
        list.add(new Product("SP005" , "Iphone XS" , "Apple" , "2022-06-17" , 8400000.0 , 15));
        list.add(new Product("SP006" , "Iphone 11" , "Apple" , "2022-06-17" , 9400000.0 , 15));
        list.add(new Product("SP007" , "Iphone 11 Pro" , "Apple" , "2022-06-17" , 4000000.0 , 15));
        list.add(new Product("SP008" , "Iphone 11 ProMax" , "Apple" , "2022-06-17" , 14000000.0 , 15));
        list.add(new Product("SP009" , "Iphone 12 ProMax" , "Apple" , "2022-06-17" , 20000000.0 , 15));
        list.add(new Product("SP0010" , "Iphone 13 ProMax" , "Apple" , "2022-06-17" , 24000000.0 , 15));
    }

    @Override
    public List<Product> findAll () {
        return list;
    }

    @Override
    public void save (Product product) {
        list.add(product);
    }

    @Override
    public void update (Product product) {
        for (int i = 0 ; i < list.size() ; i++) {
            if (list.get(i).getCodeProduct().equals(product.getCodeProduct())) {
                list.get(i).setNameProduct(product.getNameProduct());
                list.get(i).setNameProduction(product.getNameProduction());
                list.get(i).setDateImport(product.getDateImport());
                list.get(i).setPriceProduct(product.getPriceProduct());
                list.get(i).setAmountProduct(product.getAmountProduct());
                break;
            }
        }
    }

    @Override
    public void delete (Product product) {
        list.remove(product);
    }

    @Override
    public List<Product> search (String codeProduct) {
        List<Product> productList = new ArrayList<>();
        for (Product item : list) {
            if (item.getNameProduct().contains(codeProduct))
                productList.add(item);
        }
        return productList;
    }

    @Override
    public Product detail (String codeProduct) {
        for (Product item : list) {
            if (item.getCodeProduct().equals(codeProduct))
                return item;
        }
        return null;
    }
}

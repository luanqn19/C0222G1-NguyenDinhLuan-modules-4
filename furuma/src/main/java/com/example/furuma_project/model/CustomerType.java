package com.example.furuma_project.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "loai_khach")
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ma_loai_khach",  columnDefinition = "INT")
    private Integer maLoaiKhach;

    @Column(name = "ten_loai_khach",  columnDefinition = "VARCHAR(45)")
    private String tenLoaiKhach;

    @OneToMany(mappedBy = "customerType")
    private List<Customer> customerList;

    public CustomerType () {
    }

    public CustomerType (Integer maLoaiKhach , String tenLoaiKhach) {
        this.maLoaiKhach = maLoaiKhach;
        this.tenLoaiKhach = tenLoaiKhach;
    }

    public Integer getMaLoaiKhach () {
        return maLoaiKhach;
    }

    public void setMaLoaiKhach (Integer maLoaiKhach) {
        this.maLoaiKhach = maLoaiKhach;
    }

    public String getTenLoaiKhach () {
        return tenLoaiKhach;
    }

    public void setTenLoaiKhach (String tenLoaiKhach) {
        this.tenLoaiKhach = tenLoaiKhach;
    }

    public List<Customer> getCustomerList () {
        return customerList;
    }

    public void setCustomerList (List<Customer> customerList) {
        this.customerList = customerList;
    }
}

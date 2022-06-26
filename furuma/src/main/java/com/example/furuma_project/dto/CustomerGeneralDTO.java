package com.example.furuma_project.dto;

import com.example.furuma_project.model.CustomerType;

import java.util.Date;

public class CustomerGeneralDTO {
    private int maKhachHang;
    private CustomerType customerType;
    private String tenLoaiKhach;
    private String hoTen;
    private Date ngaySinh;
    private Integer gioiTinh;
    private String soCmnd;
    private String soDienThoai;
    private String email;
    private String diaChi;

    public CustomerGeneralDTO () {
    }

    public CustomerGeneralDTO (int maKhachHang , CustomerType customerType ,
                               String tenLoaiKhach , String hoTen , Date ngaySinh ,
                               Integer gioiTinh , String soCmnd , String soDienThoai ,
                               String email , String diaChi) {
        this.maKhachHang = maKhachHang;
        this.customerType = customerType;
        this.tenLoaiKhach = tenLoaiKhach;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCmnd = soCmnd;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.diaChi = diaChi;
    }

    public int getMaKhachHang () {
        return maKhachHang;
    }

    public void setMaKhachHang (int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public CustomerType getCustomerType () {
        return customerType;
    }

    public void setCustomerType (CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getTenLoaiKhach () {
        return tenLoaiKhach;
    }

    public void setTenLoaiKhach (String tenLoaiKhach) {
        this.tenLoaiKhach = tenLoaiKhach;
    }

    public String getHoTen () {
        return hoTen;
    }

    public void setHoTen (String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh () {
        return ngaySinh;
    }

    public void setNgaySinh (Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Integer getGioiTinh () {
        return gioiTinh;
    }

    public void setGioiTinh (Integer gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoCmnd () {
        return soCmnd;
    }

    public void setSoCmnd (String soCmnd) {
        this.soCmnd = soCmnd;
    }

    public String getSoDienThoai () {
        return soDienThoai;
    }

    public void setSoDienThoai (String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getDiaChi () {
        return diaChi;
    }

    public void setDiaChi (String diaChi) {
        this.diaChi = diaChi;
    }
}

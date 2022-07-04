package com.example.furuma_project.model;

import com.example.furuma_project.utils.annotation.AddressConstraint;
import com.example.furuma_project.utils.annotation.EmailConstraint;
import com.example.furuma_project.utils.annotation.NameConstraint;
import com.example.furuma_project.utils.annotation.PhoneConstraint;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

@Entity(name = "khach_hang")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ma_khach_hang", columnDefinition = "INT")
    private Integer maKhachHang;

    @ManyToOne
    @JoinColumn(name = "ma_loai_khach")
//    @JsonManagedReference(value = "customer_customerType")
    private CustomerType customerType;

    @OneToMany(mappedBy = "customerContract")
//    @JsonBackReference(value = "customer_customerContractList")
    @JsonIgnore
    private List<Contract> customerContractList;

    @NameConstraint(message = "Họ và tên không đúng định dạng")
    @NotBlank(message = "Họ và tên không được để trống!")
    @Column(name = "ho_ten", columnDefinition = "VARCHAR(45)")
    private String hoTen;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "ngay_sinh", columnDefinition = "DATE")
    private Date ngaySinh;

    @Column(name = "gioi_tinh")
    private Integer gioiTinh;

    @NotBlank(message = "Số CMND không được để trống!")
    @Column(name = "so_cmnd",  columnDefinition = "VARCHAR(45)")
    private String soCmnd;

    @PhoneConstraint
    @NotBlank(message = "Số điện thoại không được để trống!")
    @Column(name = "so_dien_thoai",  columnDefinition = "VARCHAR(45)")
    private String soDienThoai;

    @EmailConstraint
    @NotBlank(message = "Email không được để trống!")
    @Column(name = "email",  columnDefinition = "VARCHAR(45)")
    private String email;

    @AddressConstraint
    @NotBlank(message = "Địa chỉ không được để trống!")
    @Column(name = "dia_chi",  columnDefinition = "VARCHAR(45)")
    private String diaChi;

    public Customer () {
    }

    public Customer (Integer maKhachHang, CustomerType customerType , String hoTen ,
                     Date ngaySinh , Integer gioiTinh , String soCmnd , String soDienThoai ,
                     String email , String diaChi) {
        this.maKhachHang = maKhachHang;
        this.customerType = customerType;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCmnd = soCmnd;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.diaChi = diaChi;
    }

    public Integer getMaKhachHang () {
        return maKhachHang;
    }

    public void setMaKhachHang (Integer maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public CustomerType getCustomerType () {
        return customerType;
    }

    public void setCustomerType (CustomerType customerType) {
        this.customerType = customerType;
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

    public List<Contract> getCustomerContractList () {
        return customerContractList;
    }

    public void setCustomerContractList (List<Contract> customerContractList) {
        this.customerContractList = customerContractList;
    }
}

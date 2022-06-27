package com.example.furuma_project.model;

import com.example.furuma_project.utils.annotation.AddressConstraint;
import com.example.furuma_project.utils.annotation.EmailConstraint;
import com.example.furuma_project.utils.annotation.NameConstraint;
import com.example.furuma_project.utils.annotation.PhoneConstraint;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

@Entity(name = "nhan_vien")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ma_nhan_vien", columnDefinition = "VARCHAR(45)")
    Integer maNhanVien;

    @OneToMany(mappedBy = "employeeContract")
    List<Contract> employeeContractList;

    @ManyToOne
    @JoinColumn(name = "ma_vi_tri")
    private EmployeePosition employeePosition;

    @ManyToOne
    @JoinColumn(name = "ma_trinh_do")
    private EmployeeEducation employeeEducation;

    @ManyToOne
    @JoinColumn(name = "ma_bo_phan")
    private EmployeeDivision employeeDivision;

    @ManyToOne
    @JoinColumn(name = "ten_nguoi_dung")
    private EmployeeUser employeeUser;

    @NameConstraint(message = "Họ và tên không đúng định dạng")
    @NotBlank(message = "Họ và tên không được để trống!")
    @Column(name = "ho_ten", columnDefinition = "VARCHAR(45)")
    private String hoTen;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "ngay_sinh", columnDefinition = "DATE")
    private Date ngaySinh;

    @Column(name = "gioi_tinh")
    private Integer gioiTinh;

    @Min(value = 0, message = "Lương không được nhỏ hơn 0")
    @Column(name = "luong", columnDefinition = "DOUBLE")
    Double luong;

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

    public Employee () {
    }

    public Employee (EmployeePosition employeePosition ,
                     EmployeeEducation employeeEducation ,
                     EmployeeDivision employeeDivision , EmployeeUser employeeUser ,
                     String hoTen , Date ngaySinh , Integer gioiTinh , Double luong ,
                     String soCmnd , String soDienThoai , String email , String diaChi) {
        this.employeePosition = employeePosition;
        this.employeeEducation = employeeEducation;
        this.employeeDivision = employeeDivision;
        this.employeeUser = employeeUser;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.luong = luong;
        this.soCmnd = soCmnd;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.diaChi = diaChi;
    }

    public Integer getMaNhanVien () {
        return maNhanVien;
    }

    public void setMaNhanVien (Integer maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public EmployeePosition getEmployeePosition () {
        return employeePosition;
    }

    public void setEmployeePosition (EmployeePosition employeePosition) {
        this.employeePosition = employeePosition;
    }

    public EmployeeEducation getEmployeeEducation () {
        return employeeEducation;
    }

    public void setEmployeeEducation (EmployeeEducation employeeEducation) {
        this.employeeEducation = employeeEducation;
    }

    public EmployeeDivision getEmployeeDivision () {
        return employeeDivision;
    }

    public void setEmployeeDivision (EmployeeDivision employeeDivision) {
        this.employeeDivision = employeeDivision;
    }

    public EmployeeUser getEmployeeUser () {
        return employeeUser;
    }

    public void setEmployeeUser (EmployeeUser employeeUser) {
        this.employeeUser = employeeUser;
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

    public Double getLuong () {
        return luong;
    }

    public void setLuong (Double luong) {
        this.luong = luong;
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

    public List<Contract> getEmployeeContractList () {
        return employeeContractList;
    }

    public void setEmployeeContractList (List<Contract> employeeContractList) {
        this.employeeContractList = employeeContractList;
    }
}

package com.example.furuma_project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity(name = "nguoi_dung")
public class EmployeeUser {
    @Id
    @NotBlank(message = "Tên người dùng không được để trống")
    @Column(name = "ten_nguoi_dung", columnDefinition = "VARCHAR(255)")
    private String tenNguoiDung;

    @NotBlank(message = "Mật khẩu không được để trống")
    @Column(name = "mat_khau", columnDefinition = "VARCHAR(255)")
    private String matKhau;

    @OneToMany(mappedBy = "employeeUser")
    private List<Employee> listUser;

    public EmployeeUser () {
    }

    public EmployeeUser (String tenNguoiDung , String matKhau) {
        this.tenNguoiDung = tenNguoiDung;
        this.matKhau = matKhau;
    }

    public String getTenNguoiDung () {
        return tenNguoiDung;
    }

    public void setTenNguoiDung (String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
    }

    public String getMatKhau () {
        return matKhau;
    }

    public void setMatKhau (String matKhau) {
        this.matKhau = matKhau;
    }

    public List<Employee> getListUser () {
        return listUser;
    }

    public void setListUser (List<Employee> listUser) {
        this.listUser = listUser;
    }
}

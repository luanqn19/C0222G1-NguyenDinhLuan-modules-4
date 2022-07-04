package com.example.furuma_project.model;

import com.example.furuma_project.utils.annotation.NameConstraint;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity(name = "vi_tri")
public class EmployeePosition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ma_vi_tri", columnDefinition = "INT")
    private Integer maViTri;

    @NameConstraint(message = "Tên vị trí không đúng định dạng")
    @NotBlank(message = "Tên vị trí không được để trống")
    @Column(name = "ten_vi_tri", columnDefinition = "VARCHAR(45)")
    private String tenViTri;

    @OneToMany(mappedBy = "employeePosition")
//    @JsonBackReference(value = "employee_position_listPosition")
    @JsonIgnore
    private List<Employee> listPosition;

    public EmployeePosition () {
    }

    public EmployeePosition (Integer maViTri , String tenViTri) {
        this.maViTri = maViTri;
        this.tenViTri = tenViTri;
    }

    public Integer getMaViTri () {
        return maViTri;
    }

    public void setMaViTri (Integer maViTri) {
        this.maViTri = maViTri;
    }

    public String getTenViTri () {
        return tenViTri;
    }

    public void setTenViTri (String tenViTri) {
        this.tenViTri = tenViTri;
    }

    public List<Employee> getListPosition () {
        return listPosition;
    }

    public void setListPosition (List<Employee> listPosition) {
        this.listPosition = listPosition;
    }
}

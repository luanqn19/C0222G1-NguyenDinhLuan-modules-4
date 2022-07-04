package com.example.furuma_project.model;

import com.example.furuma_project.utils.annotation.NameConstraint;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity(name = "bo_phan")
public class EmployeeDivision {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ma_bo_phan", columnDefinition = "INT")
    private Integer maBoPhan;

    @Column(name = "ten_bo_phan", columnDefinition = "VARCHAR(45)")
    @NotBlank(message = "Tên bộ phận không được để trống!")
    @NameConstraint(message = "Tên bộ phận không đúng định dạng!")
    private String tenBoPhan;

    @OneToMany(mappedBy = "employeeDivision")
//    @JsonBackReference(value = "employee_division_listDivision")
    @JsonIgnore
    private List<Employee> listDivision;

    public EmployeeDivision () {
    }

    public EmployeeDivision (Integer maBoPhan , String tenBoPhan) {
        this.maBoPhan = maBoPhan;
        this.tenBoPhan = tenBoPhan;
    }

    public Integer getMaBoPhan () {
        return maBoPhan;
    }

    public void setMaBoPhan (Integer maBoPhan) {
        this.maBoPhan = maBoPhan;
    }

    public String getTenBoPhan () {
        return tenBoPhan;
    }

    public void setTenBoPhan (String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }

    public List<Employee> getListDivision () {
        return listDivision;
    }

    public void setListDivision (List<Employee> listDivision) {
        this.listDivision = listDivision;
    }
}

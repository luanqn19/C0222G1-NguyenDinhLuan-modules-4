package com.example.furuma_project.model;

import com.example.furuma_project.utils.annotation.NameConstraint;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity(name = "trinh_do")
public class EmployeeEducation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ma_trinh_do", columnDefinition = "INT")
    private Integer maTrinhDo;

    @NameConstraint(message = "Tên trình độ không đúng định dạng!")
    @NotBlank(message = "Tên trình độ không được để trống!")
    @Column(name = "ten_trinh_do", columnDefinition = "VARCHAR(45)")
    private String tenTrinhDo;

    @OneToMany(mappedBy = "employeeEducation")
    private List<Employee> listEducation;

    public EmployeeEducation () {
    }

    public EmployeeEducation (Integer maTrinhDo , String tenTrinhDo) {
        this.maTrinhDo = maTrinhDo;
        this.tenTrinhDo = tenTrinhDo;
    }

    public Integer getMaTrinhDo () {
        return maTrinhDo;
    }

    public void setMaTrinhDo (Integer maTrinhDo) {
        this.maTrinhDo = maTrinhDo;
    }

    public String getTenTrinhDo () {
        return tenTrinhDo;
    }

    public void setTenTrinhDo (String tenTrinhDo) {
        this.tenTrinhDo = tenTrinhDo;
    }

    public List<Employee> getListEducation () {
        return listEducation;
    }

    public void setListEducation (List<Employee> listEducation) {
        this.listEducation = listEducation;
    }
}

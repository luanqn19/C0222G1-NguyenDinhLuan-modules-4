package com.example.furuma_project.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity(name = "loai_dich_vu")
public class FacilityServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ma_loai_dich_vu", columnDefinition = "INT")
    private Integer maLoaiDichVu;

    @Column(name = "ten_loai_dich_vu", columnDefinition = "VARCHAR(45)")
    private String tenLoaiDichVu;

    @OneToMany(mappedBy = "facilityServiceType")
//    @JsonBackReference(value = "facility_service_type_serviceTypeList")
    @JsonIgnore
    List<Facility> serviceTypeList;

    public FacilityServiceType () {
    }

    public FacilityServiceType (Integer maLoaiDichVu , String tenLoaiDichVu) {
        this.maLoaiDichVu = maLoaiDichVu;
        this.tenLoaiDichVu = tenLoaiDichVu;
    }

    public Integer getMaLoaiDichVu () {
        return maLoaiDichVu;
    }

    public void setMaLoaiDichVu (Integer maLoaiDichVu) {
        this.maLoaiDichVu = maLoaiDichVu;
    }

    public String getTenLoaiDichVu () {
        return tenLoaiDichVu;
    }

    public void setTenLoaiDichVu (String tenLoaiDichVu) {
        this.tenLoaiDichVu = tenLoaiDichVu;
    }

    public List<Facility> getServiceTypeList () {
        return serviceTypeList;
    }

    public void setServiceTypeList (List<Facility> serviceTypeList) {
        this.serviceTypeList = serviceTypeList;
    }
}

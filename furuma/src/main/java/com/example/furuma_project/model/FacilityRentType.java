package com.example.furuma_project.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "kieu_thue")
public class FacilityRentType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ma_kieu_thue", columnDefinition = "INT")
    private Integer maKieuThue;

    @Column(name = "ten_kieu_thue", columnDefinition = "VARCHAR(45)")
    private String tenKieuThue;

    @Column(name = "gia_kieu_thue", columnDefinition = "DOUBLE")
    private Double giaKieuThue;

    @OneToMany(mappedBy = "facilityRentType")
    private List<Facility> rentList;

    public FacilityRentType () {
    }

    public FacilityRentType (Integer maKieuThue , String tenKieuThue , Double giaKieuThue) {
        this.maKieuThue = maKieuThue;
        this.tenKieuThue = tenKieuThue;
        this.giaKieuThue = giaKieuThue;
    }

    public List<Facility> getRentList () {
        return rentList;
    }

    public void setRentList (List<Facility> rentList) {
        this.rentList = rentList;
    }

    public Integer getMaKieuThue () {
        return maKieuThue;
    }

    public void setMaKieuThue (Integer maKieuThue) {
        this.maKieuThue = maKieuThue;
    }

    public String getTenKieuThue () {
        return tenKieuThue;
    }

    public void setTenKieuThue (String tenKieuThue) {
        this.tenKieuThue = tenKieuThue;
    }

    public Double getGiaKieuThue () {
        return giaKieuThue;
    }

    public void setGiaKieuThue (Double giaKieuThue) {
        this.giaKieuThue = giaKieuThue;
    }
}

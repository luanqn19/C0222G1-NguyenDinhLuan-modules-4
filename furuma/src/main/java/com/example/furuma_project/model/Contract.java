package com.example.furuma_project.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.Date;
import java.util.List;

@Entity(name = "hop_dong")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ma_hop_dong", columnDefinition = "INT")
    private Integer maHopDong;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "ngay_lam_hop_dong", columnDefinition = "DATE")
    private Date ngayLamHopDong;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "ngay_ket_thuc", columnDefinition = "DATE")
    private Date ngayKetThuc;

    @Min(value = 0, message = "Tiền trả trước không được nhỏ hơn 0!")
    @Column(name = "tien_dat_coc", columnDefinition = "DOUBLE")
    private Double tienDatCoc;

    @Column(name = "tong_tien", columnDefinition = "DOUBLE")
    private Double tongTien;

    @ManyToOne
    @JoinColumn(name = "ma_nhan_vien")
//    @JsonManagedReference(value = "contract_employeeContract")
    private Employee employeeContract;

    @ManyToOne
    @JoinColumn(name = "ma_khach_hang")
//    @JsonManagedReference(value = "contract_customerContract")
    private Customer customerContract;

    @ManyToOne
    @JoinColumn(name = "ma_dich_vu")
//    @JsonManagedReference(value = "contact_facilityContract")
    private Facility facilityContract;

    @OneToMany(mappedBy = "contract")
//    @JsonBackReference(value = "contract_contractDetailContractList")
    @JsonIgnore
    List<ContractDetail> contractDetailContractList;

    public Contract () {
    }

    public Contract (Integer maHopDong , Date ngayLamHopDong , Date ngayKetThuc ,
                     Double tienDatCoc , Double tongTien , Employee employeeContract ,
                     Customer customerContract , Facility facilityContract) {
        this.maHopDong = maHopDong;
        this.ngayLamHopDong = ngayLamHopDong;
        this.ngayKetThuc = ngayKetThuc;
        this.tienDatCoc = tienDatCoc;
        this.tongTien = tongTien;
        this.employeeContract = employeeContract;
        this.customerContract = customerContract;
        this.facilityContract = facilityContract;
    }

    public Integer getMaHopDong () {
        return maHopDong;
    }

    public void setMaHopDong (Integer maHopDong) {
        this.maHopDong = maHopDong;
    }

    public Date getNgayLamHopDong () {
        return ngayLamHopDong;
    }

    public void setNgayLamHopDong (Date ngayLamHopDong) {
        this.ngayLamHopDong = ngayLamHopDong;
    }

    public Date getNgayKetThuc () {
        return ngayKetThuc;
    }

    public void setNgayKetThuc (Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public Double getTienDatCoc () {
        return tienDatCoc;
    }

    public void setTienDatCoc (Double tienDatCoc) {
        this.tienDatCoc = tienDatCoc;
    }

    public Double getTongTien () {
        return tongTien;
    }

    public void setTongTien (Double tongTien) {
        this.tongTien = tongTien;
    }

    public Employee getEmployeeContract () {
        return employeeContract;
    }

    public void setEmployeeContract (Employee employeeContract) {
        this.employeeContract = employeeContract;
    }

    public Customer getCustomerContract () {
        return customerContract;
    }

    public void setCustomerContract (Customer customerContract) {
        this.customerContract = customerContract;
    }

    public Facility getFacilityContract () {
        return facilityContract;
    }

    public void setFacilityContract (Facility facilityContract) {
        this.facilityContract = facilityContract;
    }

    public List<ContractDetail> getContractDetailContractList () {
        return contractDetailContractList;
    }

    public void setContractDetailContractList (List<ContractDetail> contractDetailContractList) {
        this.contractDetailContractList = contractDetailContractList;
    }
}

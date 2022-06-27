package com.example.furuma_project.model;

import com.example.furuma_project.utils.annotation.NameConstraint;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity(name = "dich_vu")
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ma_dich_vu", columnDefinition = "INT")
    private Integer maDichVu;

    @Min(value = 0, message = "Chi phí thuê phải lớn hơn 0!")
    @Column(name = "chi_phi_thue", columnDefinition = "DOUBLE")
    private Double chiPhiThue;

    @Min(value = 0, message = "Số người tối đa phải lớn hơn 0!")
    @Column(name = "so_nguoi_toi_da", columnDefinition = "INT")
    private Integer soNguoiToiDa;

    @OneToMany(mappedBy = "facilityContract")
    List<Contract> facilityContractList;

    @ManyToOne
    @JoinColumn(name = "ma_kieu_thue")
    private FacilityRentType facilityRentType;

    @ManyToOne
    @JoinColumn(name = "ma_loai_dich_vu")
    private FacilityServiceType facilityServiceType;

    @Min(value = 0, message = "Số tầng phải lớn hơn 0!")
    @Column(name = "so_tang", columnDefinition = "INT")
    private Integer soTang;

    @NameConstraint(message = "Tên dịch vụ không đúng định dạng!")
    @NotBlank(message = "Tên dịch vụ không được để trống!")
    @Column(name = "ten_dich_vu", columnDefinition = "VARCHAR(45)")
    private String tenDichVu;

    @NotBlank(message = "Mô tả không được để trống!")
    @Column(name = "mo_ta_tien_nghi_khac", columnDefinition = "VARCHAR(100)")
    private String moTaTienNghiKhac;

    @NotBlank(message = "Tiêu chuẩn phòng không được để trống!")
    @Column(name = "tieu_chuan_phong", columnDefinition = "VARCHAR(45)")
    private String tieuChuanPhong;

    @NotBlank(message = "Dịch vụ đi kèm không được để trống!")
    @Column(name = "dich_vu_di_kem", columnDefinition = "VARCHAR(100)")
    private String dichVuDiKem;

    @Min(value = 0, message = "Diện tích phải lớn hơn 0!")
    @Column(name = "dien_tich", columnDefinition = "DOUBLE")
    private Double dienTich;

    @Min(value = 0, message = "Diện tích hồ bơi phải lớn hơn 0!")
    @Column(name = "dien_tich_ho_boi", columnDefinition = "DOUBLE")
    private Double dienTichHoBoi;

    public Facility () {
    }

    public Facility (Integer maDichVu , Double chiPhiThue , Integer soNguoiToiDa ,
                     FacilityRentType facilityRentType , FacilityServiceType facilityServiceType ,
                     Integer soTang , String tenDichVu , String moTaTienNghiKhac , String tieuChuanPhong ,
                     String dichVuDiKem, Double dienTich , Double dienTichHoBoi) {
        this.maDichVu = maDichVu;
        this.chiPhiThue = chiPhiThue;
        this.soNguoiToiDa = soNguoiToiDa;
        this.facilityRentType = facilityRentType;
        this.facilityServiceType = facilityServiceType;
        this.soTang = soTang;
        this.tenDichVu = tenDichVu;
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.tieuChuanPhong = tieuChuanPhong;
        this.dichVuDiKem = dichVuDiKem;
        this.dienTich = dienTich;
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public String getDichVuDiKem () {
        return dichVuDiKem;
    }

    public void setDichVuDiKem (String dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }

    public Integer getMaDichVu () {
        return maDichVu;
    }

    public void setMaDichVu (Integer maDichVu) {
        this.maDichVu = maDichVu;
    }

    public Double getChiPhiThue () {
        return chiPhiThue;
    }

    public void setChiPhiThue (Double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public Integer getSoNguoiToiDa () {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa (Integer soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public FacilityRentType getFacilityRentType () {
        return facilityRentType;
    }

    public void setFacilityRentType (FacilityRentType facilityRentType) {
        this.facilityRentType = facilityRentType;
    }

    public FacilityServiceType getFacilityServiceType () {
        return facilityServiceType;
    }

    public void setFacilityServiceType (FacilityServiceType facilityServiceType) {
        this.facilityServiceType = facilityServiceType;
    }

    public Integer getSoTang () {
        return soTang;
    }

    public void setSoTang (Integer soTang) {
        this.soTang = soTang;
    }

    public String getTenDichVu () {
        return tenDichVu;
    }

    public void setTenDichVu (String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getMoTaTienNghiKhac () {
        return moTaTienNghiKhac;
    }

    public void setMoTaTienNghiKhac (String moTaTienNghiKhac) {
        this.moTaTienNghiKhac = moTaTienNghiKhac;
    }

    public String getTieuChuanPhong () {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong (String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public Double getDienTich () {
        return dienTich;
    }

    public void setDienTich (Double dienTich) {
        this.dienTich = dienTich;
    }

    public Double getDienTichHoBoi () {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi (Double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public List<Contract> getFacilityContractList () {
        return facilityContractList;
    }

    public void setFacilityContractList (List<Contract> facilityContractList) {
        this.facilityContractList = facilityContractList;
    }
}

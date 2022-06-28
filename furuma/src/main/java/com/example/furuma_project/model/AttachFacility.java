package com.example.furuma_project.model;

import com.example.furuma_project.utils.annotation.NameConstraint;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity(name = "dich_vu_di_kem")
public class AttachFacility {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ma_dich_vu_di_kem", columnDefinition = "INT")
    private Integer maDichVuDiKem;

    @NameConstraint(message = "Tên dịch vụ đi kèm không đúng định dạng")
    @NotBlank(message = "Tên dịch vụ đi kèm không được để trống!")
    @Column(name = "ten_dich_vu_di_kem", columnDefinition = "VARCHAR(45)")
    private String tenDichVuDiKem;

    @NotBlank(message = "Tên đơn vị không được để trống!")
    @Column(name = "don_vi", columnDefinition = "VARCHAR(10)")
    private String donVi;

    @NotBlank(message = "Trạng thái không được để trống!")
    @Column(name = "trang_thai", columnDefinition = "VARCHAR(45)")
    private String trangThai;

    @Min(value = 0, message = "Giá phải lớn hơn 0!")
    @Column(name = "gia", columnDefinition = "DOUBLE")
    private Double gia;

    @OneToMany(mappedBy = "attachFacility")
    List<ContractDetail> contractDetailAttachList;

    public AttachFacility () {
    }

    public AttachFacility (Integer maDichVuDiKem , String tenDichVuDiKem , String donVi ,
                           String trangThai ,  Double gia) {
        this.maDichVuDiKem = maDichVuDiKem;
        this.tenDichVuDiKem = tenDichVuDiKem;
        this.donVi = donVi;
        this.trangThai = trangThai;
        this.gia = gia;
    }

    public Integer getMaDichVuDiKem () {
        return maDichVuDiKem;
    }

    public void setMaDichVuDiKem (Integer maDichVuDiKem) {
        this.maDichVuDiKem = maDichVuDiKem;
    }

    public String getTenDichVuDiKem () {
        return tenDichVuDiKem;
    }

    public void setTenDichVuDiKem (String tenDichVuDiKem) {
        this.tenDichVuDiKem = tenDichVuDiKem;
    }

    public String getDonVi () {
        return donVi;
    }

    public void setDonVi (String donVi) {
        this.donVi = donVi;
    }

    public String getTrangThai () {
        return trangThai;
    }

    public void setTrangThai (String trangThai) {
        this.trangThai = trangThai;
    }

    public Double getGia () {
        return gia;
    }

    public void setGia (Double gia) {
        this.gia = gia;
    }

    public List<ContractDetail> getContractDetailAttachList () {
        return contractDetailAttachList;
    }

    public void setContractDetailAttachList (List<ContractDetail> contractDetailAttachList) {
        this.contractDetailAttachList = contractDetailAttachList;
    }
}

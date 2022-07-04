package com.example.furuma_project.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity(name = "chi_tiet_hop_dong")
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ma_hop_dong_chi_tiet", columnDefinition = "INT")
    private Integer maHopDongChiTiet;

    @Min(value = 0, message = "Số lượng phải lớn hơn hoặc bằng 0")
    @Column(name = "so_luong", columnDefinition = "INT")
    private Integer soLuong;

    @ManyToOne
    @JoinColumn(name = "ma_hop_dong")
//    @JsonManagedReference(value = "contract_detail_contact")
    private Contract contract;

    @ManyToOne
    @JoinColumn(name = "ma_dich_vu_di_kem")
//    @JsonManagedReference(value = "contract_detail_attachFacility")
    private AttachFacility attachFacility;

    public ContractDetail () {
    }

    public ContractDetail (Integer maHopDongChiTiet , Integer soLuong , Contract contract ,
                           AttachFacility attachFacility) {
        this.maHopDongChiTiet = maHopDongChiTiet;
        this.soLuong = soLuong;
        this.contract = contract;
        this.attachFacility = attachFacility;
    }

    public Integer getMaHopDongChiTiet () {
        return maHopDongChiTiet;
    }

    public void setMaHopDongChiTiet (Integer maHopDongChiTiet) {
        this.maHopDongChiTiet = maHopDongChiTiet;
    }

    public Integer getSoLuong () {
        return soLuong;
    }

    public void setSoLuong (Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Contract getContract () {
        return contract;
    }

    public void setContract (Contract contract) {
        this.contract = contract;
    }

    public AttachFacility getAttachFacility () {
        return attachFacility;
    }

    public void setAttachFacility (AttachFacility attachFacility) {
        this.attachFacility = attachFacility;
    }
}

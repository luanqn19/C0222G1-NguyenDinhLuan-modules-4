package com.example.furuma_project.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity(name = "vai_tro")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "vai_tro_id", columnDefinition = "INT")
    private Integer vaiTroId;

    @NotBlank(message = "Tên vai trò không được trống!")
    @Column(name = "ten_vai_tro", columnDefinition = "VARCHAR(255")
    private String tenVaiTro;

    @OneToMany(mappedBy = "role")
//    @JsonBackReference(value = "role_roleUserList")
    @JsonIgnore
    List<RoleUser> roleUserList;

    public Role () {
    }

    public Role (Integer vaiTroId , String tenVaiTro) {
        this.vaiTroId = vaiTroId;
        this.tenVaiTro = tenVaiTro;
    }

    public Integer getVaiTroId () {
        return vaiTroId;
    }

    public void setVaiTroId (Integer vaiTroId) {
        this.vaiTroId = vaiTroId;
    }

    public String getTenVaiTro () {
        return tenVaiTro;
    }

    public void setTenVaiTro (String tenVaiTro) {
        this.tenVaiTro = tenVaiTro;
    }

    public List<RoleUser> getRoleUserList () {
        return roleUserList;
    }

    public void setRoleUserList (List<RoleUser> roleUserList) {
        this.roleUserList = roleUserList;
    }
}

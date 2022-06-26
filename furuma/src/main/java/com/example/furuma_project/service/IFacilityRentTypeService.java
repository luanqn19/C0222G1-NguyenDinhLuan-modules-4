package com.example.furuma_project.service;

import com.example.furuma_project.model.FacilityRentType;

import java.util.List;

public interface IFacilityRentTypeService {
    List<FacilityRentType> findAll();

    void save(FacilityRentType facilityRentType);
}

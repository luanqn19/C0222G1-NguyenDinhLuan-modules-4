package com.example.furuma_project.service;

import com.example.furuma_project.model.FacilityServiceType;
import com.example.furuma_project.service.impl.FacilityTypeService;

import java.util.List;

public interface IFacilityTypeService {
    List<FacilityServiceType> findAll();

    void save(FacilityServiceType facilityServiceType);
}

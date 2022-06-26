package com.example.furuma_project.service.impl;

import com.example.furuma_project.model.FacilityServiceType;
import com.example.furuma_project.repository.IFacilityTypeServiceRepository;
import com.example.furuma_project.service.IFacilityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityTypeService implements IFacilityTypeService {
    @Autowired
    private IFacilityTypeServiceRepository facilityTypeServiceRepository;

    @Override
    public List<FacilityServiceType> findAll () {
        return facilityTypeServiceRepository.findAll();
    }

    @Override
    public void save (FacilityServiceType facilityServiceType) {
        facilityTypeServiceRepository.save(facilityServiceType);
    }
}

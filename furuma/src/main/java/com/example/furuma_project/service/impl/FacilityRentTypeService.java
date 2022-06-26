package com.example.furuma_project.service.impl;

import com.example.furuma_project.model.FacilityRentType;
import com.example.furuma_project.repository.IFacilityRentTypeRepository;
import com.example.furuma_project.service.IFacilityRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityRentTypeService implements IFacilityRentTypeService {
    @Autowired
    private IFacilityRentTypeRepository facilityRentTypeRepository;

    @Override
    public List<FacilityRentType> findAll () {
        return facilityRentTypeRepository.findAll();
    }

    @Override
    public void save (FacilityRentType facilityRentType) {
        facilityRentTypeRepository.save(facilityRentType);
    }
}

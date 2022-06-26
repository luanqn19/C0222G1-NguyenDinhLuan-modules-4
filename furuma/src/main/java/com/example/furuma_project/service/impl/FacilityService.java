package com.example.furuma_project.service.impl;

import com.example.furuma_project.model.Facility;
import com.example.furuma_project.repository.IFacilityRepository;
import com.example.furuma_project.service.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FacilityService implements IFacilityService {
    @Autowired
    private IFacilityRepository facilityRepository;


    @Override
    public Page<Facility> findAll (Pageable pageable) {
        return facilityRepository.findAll(pageable);
    }

    @Override
    public void save (Facility facility) {
        facilityRepository.save(facility);
    }
}

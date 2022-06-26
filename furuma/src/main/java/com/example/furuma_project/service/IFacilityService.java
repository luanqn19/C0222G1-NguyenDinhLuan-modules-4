package com.example.furuma_project.service;

import com.example.furuma_project.model.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IFacilityService {
    Page<Facility> findAll(Pageable pageable);

    void save(Facility facility);
}

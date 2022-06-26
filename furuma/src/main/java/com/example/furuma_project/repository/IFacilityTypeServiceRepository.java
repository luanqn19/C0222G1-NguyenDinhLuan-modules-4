package com.example.furuma_project.repository;

import com.example.furuma_project.model.FacilityServiceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFacilityTypeServiceRepository extends JpaRepository<FacilityServiceType, Integer> {
}

package com.example.furuma_project.repository;

import com.example.furuma_project.model.Facility;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFacilityRepository extends JpaRepository<Facility, Integer> {
}

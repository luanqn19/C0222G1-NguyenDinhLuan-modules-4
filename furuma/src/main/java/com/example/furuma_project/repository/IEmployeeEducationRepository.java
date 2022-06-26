package com.example.furuma_project.repository;

import com.example.furuma_project.model.EmployeeEducation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeEducationRepository extends JpaRepository<EmployeeEducation, Integer> {
}

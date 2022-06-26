package com.example.furuma_project.repository;

import com.example.furuma_project.model.EmployeePosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeePositionRepository extends JpaRepository<EmployeePosition, Integer> {
}

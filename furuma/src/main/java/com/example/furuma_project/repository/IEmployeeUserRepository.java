package com.example.furuma_project.repository;

import com.example.furuma_project.model.EmployeeUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeUserRepository extends JpaRepository<EmployeeUser, String> {
}

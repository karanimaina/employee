package com.example.employee_pf.repository;

import com.example.employee_pf.models.Employee;
import lombok.extern.java.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

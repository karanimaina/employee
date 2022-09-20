package com.example.employee_pf.service;

import com.example.employee_pf.models.Employee;
import com.example.employee_pf.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService{
private final EmployeeRepository employeeRepository;

public void insert (Employee employee){
    employeeRepository.save(employee);
}
public List<Employee>retrieveEmployee(){
    return employeeRepository.findAll();
}

}

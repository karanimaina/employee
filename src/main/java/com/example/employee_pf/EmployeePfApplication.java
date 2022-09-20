package com.example.employee_pf;

import com.example.employee_pf.models.FullTimeEmployee;
import com.example.employee_pf.models.PartTimeEmployee;
import com.example.employee_pf.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class EmployeePfApplication implements CommandLineRunner {
private final EmployeeService employeeService;
    public static void main(String[] args) {
        SpringApplication.run(EmployeePfApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        employeeService.insert(new PartTimeEmployee(1L,"feliz",20L));
        employeeService.insert(new FullTimeEmployee(2L,"feliz",2000000L));

    }
}

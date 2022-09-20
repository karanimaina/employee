package com.example.employee_pf.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Getter
@NoArgsConstructor
public class FullTimeEmployee extends Employee{
    private long salary;

    public FullTimeEmployee(long id, String name, long salary) {
        super(id, name);
        this.salary = salary;
    }


}

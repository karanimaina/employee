package com.example.employee_pf.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.NamedEntityGraph;

@Entity
@Getter
@NoArgsConstructor
public class PartTimeEmployee  extends Employee{
    private long hourlyWage;

    public PartTimeEmployee(long id, String name, long hourlyWage) {
        super(id, name);
        this.hourlyWage = hourlyWage;
    }
}

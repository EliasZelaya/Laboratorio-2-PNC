package com.example.eeza.laboratorio2.repositories;

import com.example.eeza.laboratorio2.entities.Employee;

import java.util.List;

public interface EmployeeRepository {
    public Employee findEmployeeById();
    public List<Employee> findAllEmployees();
    public String saveEmployee();
    public Employee updateEmployee();
    public String deleteEmployee();
}

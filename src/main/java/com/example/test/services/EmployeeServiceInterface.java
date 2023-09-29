package com.example.test.services;

import com.example.test.models.Employee;

import java.util.List;

public interface EmployeeServiceInterface {
    Employee saveEmployee(Employee employee);
    List<Employee> getALlEmployees();
}

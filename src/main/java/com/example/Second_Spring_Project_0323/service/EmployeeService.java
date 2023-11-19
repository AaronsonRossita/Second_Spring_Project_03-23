package com.example.Second_Spring_Project_0323.service;

import com.example.Second_Spring_Project_0323.model.Employee;

import java.util.List;

public interface EmployeeService {
    void createEmployee(Employee employee);

    Employee getEmployeeById(Integer id);
    List<Employee> getAllEmployees();
    List<Employee> getByJobTitle(String jobTitle);
}

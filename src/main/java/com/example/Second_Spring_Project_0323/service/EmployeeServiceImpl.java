package com.example.Second_Spring_Project_0323.service;

import com.example.Second_Spring_Project_0323.model.Employee;
import com.example.Second_Spring_Project_0323.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public void createEmployee(Employee employee) {
        employeeRepository.createEmployee(employee);
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeRepository.getEmployeeById(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    @Override
    public List<Employee> getByJobTitle(String jobTitle) {
        return employeeRepository.getByJobTitle(jobTitle);
    }
}

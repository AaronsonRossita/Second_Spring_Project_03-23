package com.example.Second_Spring_Project_0323.controller;

import com.example.Second_Spring_Project_0323.model.Employee;
import com.example.Second_Spring_Project_0323.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    void createEmployee(@RequestBody Employee employee){
        employeeService.createEmployee(employee);
    }

    @GetMapping("/by_id/{id}")
    Employee getEmployeeById(@PathVariable Integer id){
        return employeeService.getEmployeeById(id);
    }
    @GetMapping("/all")
    List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    @GetMapping("/job_title")
    List<Employee> getByJobTitle(@RequestParam(value = "job_title") String jobTitle){
        return employeeService.getByJobTitle(jobTitle);
    }

}

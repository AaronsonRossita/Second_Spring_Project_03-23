package com.example.Second_Spring_Project_0323.repository;

import com.example.Second_Spring_Project_0323.model.Employee;
import com.example.Second_Spring_Project_0323.repository.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void createEmployee(Employee employee) {
        String sql = "INSERT INTO employee (name,job_title) VALUES (?,?)";
        jdbcTemplate.update(sql,employee.getName(),employee.getJobTitle());
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        String sql = "SELECT * FROM employee WHERE id = ?";
        return jdbcTemplate.queryForObject(sql,new EmployeeMapper(),id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        String sql = "SELECT * FROM employee";
        return jdbcTemplate.query(sql,new EmployeeMapper());
    }

    @Override
    public List<Employee> getByJobTitle(String jobTitle) {
        String sql = "SELECT * FROM employee WHERE job_title = ?";
        return jdbcTemplate.query(sql,new EmployeeMapper(), jobTitle);
    }
}

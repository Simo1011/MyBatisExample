package com.example.MybatisExample.controller;

import com.example.MybatisExample.entity.Employee;
import com.example.MybatisExample.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeMapper employeeMapper;

    @Autowired
    public EmployeeController(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeMapper.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeMapper.getEmployeeById(id);
    }

    @PostMapping
    public void insertEmployee(@RequestBody Employee employee) {
        employeeMapper.insertEmployee(employee);
    }

    @PutMapping("/{id}")
    public void updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        employee.setID(id);
        employeeMapper.updateEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeeMapper.deleteEmployee(id);
    }
}

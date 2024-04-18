package com.gl.Practice.controller;

import com.gl.Practice.model.Employee;
import com.gl.Practice.service.EmployeeService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("getAllEmployees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("getEmployeeById/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Integer id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("getEmployeeByName/{name}")
    public Employee getEmployeeByName(@PathVariable String name){
        return employeeService.getEmployeeByName(name);
    }

    @PostMapping("addEmployee")
    public String addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @DeleteMapping("deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable Integer id){
        return employeeService.deleteEmployee(id);
    }


    @PutMapping("update/{id}")
    public String updateEmployeeById(@PathVariable Integer id,@RequestBody Employee employee){
        return employeeService.updateEmployeeById(id,employee);
    }
}

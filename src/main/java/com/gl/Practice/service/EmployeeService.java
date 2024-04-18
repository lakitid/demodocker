package com.gl.Practice.service;

import com.gl.Practice.Repository.EmployeeRepository;
import com.gl.Practice.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Integer id) {
        return employeeRepository.findById(id);
    }

    public Employee getEmployeeByName(String name) {
        return employeeRepository.findByName(name);
    }

    public String addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "Added!";
    }

    public String deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
        return "deleted!";
    }

    public String updateEmployeeById(Integer id, Employee employee) {
        Employee updatedEmpl = employeeRepository.findById(id).get();
        updatedEmpl.setName(employee.getName());
        updatedEmpl.setAddress(employee.getAddress());
        employeeRepository.save(updatedEmpl);
        return "Updated!";
    }
}

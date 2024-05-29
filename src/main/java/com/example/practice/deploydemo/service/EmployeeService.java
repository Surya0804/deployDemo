package com.example.practice.deploydemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.deploydemo.entity.Employee;
import com.example.practice.deploydemo.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public String addEmployeeLoginDetails(Employee employee) {
        employeeRepository.save(employee);
        return "Employee Login Details Added Successfully";
    }

    public List<Employee> getEmployeesData() {
        return employeeRepository.findAll();
    }
}

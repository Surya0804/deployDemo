package com.example.practice.deploydemo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.deploydemo.entity.Employee;
import com.example.practice.deploydemo.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployeeLoginDetails")
    public String addEmployeeLoginDetails(@RequestBody Employee employee) {
        return employeeService.addEmployeeLoginDetails(employee);
    }
}

package com.example.practice.deploydemo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.deploydemo.entity.Employee;
import com.example.practice.deploydemo.service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@CrossOrigin(origins = "https://beamish-unicorn-03269b.netlify.app/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployeeLoginDetails")
    public String addEmployeeLoginDetails(@RequestBody Employee employee) {
        return employeeService.addEmployeeLoginDetails(employee);
    }

    @GetMapping("/getEmployeesData")
    public List<Employee> getEmployeesData() {
        return employeeService.getEmployeesData();
    }

}

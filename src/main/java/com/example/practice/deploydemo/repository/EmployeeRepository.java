package com.example.practice.deploydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practice.deploydemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

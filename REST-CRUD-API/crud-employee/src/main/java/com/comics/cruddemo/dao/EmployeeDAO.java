package com.comics.cruddemo.dao;

import com.comics.cruddemo.entity.Employee;
import com.comics.cruddemo.service.EmployeeService;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}

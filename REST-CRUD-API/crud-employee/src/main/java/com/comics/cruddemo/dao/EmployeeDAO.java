package com.comics.cruddemo.dao;

import com.comics.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}

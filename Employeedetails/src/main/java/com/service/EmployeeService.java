package com.service;

import java.util.List;

import com.entity.Employee;

public interface EmployeeService {
    public Integer saveEmployee(Employee employee);

    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(Integer eid);

    public void deleteEmployee(Integer eid);
}

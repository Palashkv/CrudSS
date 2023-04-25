package com.service;

import com.entity.Employee;
import com.repos.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl  implements EmployeeService{
    @Autowired
    private EmployeeRepository repository;


    @Override
    public Integer saveEmployee(Employee employee) {
        return repository.save(employee).getEid();
    }

    @Override
    public List<Employee> getAllEmployees() {
        return (List<Employee>) repository.findAll();
    }

    @Override
    public Employee getEmployeeById(Integer eid) {
        return repository.findById(eid).get();
    }

    @Override
    public void deleteEmployee(Integer eid) {
repository.deleteById(eid);
    }

	
}

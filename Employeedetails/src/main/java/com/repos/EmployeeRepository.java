package com.repos;

import org.springframework.data.repository.CrudRepository;

import com.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
}

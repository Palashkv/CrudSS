package com.controller;

import com.entity.Employee;
import com.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Details")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/saveemp")
    public ResponseEntity<String> saveEmployee( @RequestBody Employee employee){
        Integer id = service.saveEmployee(employee);
        return  new ResponseEntity<String>("Employee with '"+id+"' has been saved", HttpStatus.OK);

    }
    @GetMapping("/employeeList")
    public ResponseEntity<List<Employee>> getAllEmployeeDetails(){
        List<Employee> list = service.getAllEmployees();
        return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
    }

    @GetMapping("/getEmployeeById/{eid}")
    public ResponseEntity<Employee> getEmployeeById( @PathVariable("eid")  Integer eid){
        Employee empp = service.getEmployeeById(eid);
        return new ResponseEntity<Employee>(empp,HttpStatus.OK);
    }
    @PutMapping("/updateEmployee/{eid}")
    public ResponseEntity<String> updateEmployee( @PathVariable("eid") Integer eid,  @RequestBody Employee employee){
        Employee empp = service.getEmployeeById(eid);
        
        empp.setFirst_Name(employee.getFirst_Name());		
        empp.setLast_Name(employee.getLast_Name());
        empp.setEmail(employee.getEmail());
        empp.setAge(employee.getAge());
        
        Integer id = service.saveEmployee(empp);
        return new ResponseEntity<String>("Employee with '"+id+"' has been updated",HttpStatus.OK);

    }
    @DeleteMapping("deleteEmployee/{eid}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("eid") Integer eid){
        service.deleteEmployee(eid);
        return new ResponseEntity<String>("Employee with '"+eid+"' has been deleted",HttpStatus.OK);
    }
}

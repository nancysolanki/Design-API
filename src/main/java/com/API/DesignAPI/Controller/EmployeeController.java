package com.API.DesignAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.API.DesignAPI.Model.Employee;
import com.API.DesignAPI.Service.EmployeeService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeService empService;

    @PostMapping("/employee")
    public Employee createEmp(Employee emp){
        return empService.create(emp);
    }

    @GetMapping("/employee")
    public List<Employee> readEmployees() {
        return empService.findEmployee();
    }

    @PutMapping("/employee/{id}")
    public Employee updateEmp(@PathVariable(value = "id") int id,Employee empDetails) {
        System.out.println("Received request to update employee with id: " + id);
        System.out.println("Employee details: " + empDetails.toString());
        return empService.updateEmployee(id, empDetails);
    }
    @DeleteMapping("/employee/{id}")
    public void deleteEmp(@PathVariable( value ="id" ) int id){
        empService.deleteEmployee(id);
    }


}

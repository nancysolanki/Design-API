package com.API.DesignAPI.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.API.DesignAPI.Model.Employee;
import com.API.DesignAPI.Repository.EmployeeRepository;
import java.util.List;

@Service
public class EmployeeService {

        @Autowired
            EmployeeRepository empRepository;  
            
            //Create and save new document 
            public Employee create(Employee emp){
                return empRepository.save(emp);

            }
            //Find Employee
            public List<Employee> findEmployee(Employee emp)
            {
                return empRepository.findAll();
            }
            //Delete Employee
            public void deleteEmployee(Employee emp){
                empRepository.delete(emp);
            }
}
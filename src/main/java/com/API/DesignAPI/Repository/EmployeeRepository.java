package com.API.DesignAPI.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.API.DesignAPI.Model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}
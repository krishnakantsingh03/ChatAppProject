package com.example.hello.repository;

import com.example.hello.view.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee, String> {
}

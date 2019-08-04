package com.marco.assignment.repository.employeerepo;

import com.marco.assignment.domain.Employee;
import com.marco.assignment.repository.RepositoryGI;

import java.util.Set;

public interface EmployeeRepository extends RepositoryGI<Employee, Integer> {
    Set<Employee> getAllEmployees();
}

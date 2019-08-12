package com.marco.assignment.repository.employee.employeerepo;

import com.marco.assignment.domain.employee.Employee;
import com.marco.assignment.repository.RepositoryGI;

import java.util.Set;

public interface EmployeeRepository extends RepositoryGI<Employee, Integer> {
    Set<Employee> getAllEmployees();
}

package com.marco.assignment.Services.employeeservice;

import com.marco.assignment.Services.ServiceGI;
import com.marco.assignment.domain.Employee;

import java.util.Set;

public interface EmployeeService extends ServiceGI<Employee, Integer> {
    Set<Employee> getAllEmployees();
}

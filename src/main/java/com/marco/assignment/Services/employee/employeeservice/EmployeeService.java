package com.marco.assignment.Services.employee.employeeservice;

import com.marco.assignment.Services.ServiceGI;
import com.marco.assignment.domain.employee.Employee;

import java.util.Set;

public interface EmployeeService extends ServiceGI<Employee, Integer> {
    Set<Employee> getAllEmployees();
}

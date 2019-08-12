package com.marco.assignment.Services.employee.employeeservice;

import com.marco.assignment.Services.ServiceGI;
import com.marco.assignment.domain.employee.EmployeeGender;

import java.util.Set;

public interface EmployeeGenderService extends ServiceGI <EmployeeGender, Integer> {
    Set<EmployeeGender> getAllEmployeeGenders();
}

package com.marco.assignment.Services.employee.employeeservice;

import com.marco.assignment.domain.employee.*;

public interface EmployeeDetailsService {
    Employee create(Employee employee, EmployeeRace employeeRace, EmployeeGender employeeGender);
    Employee update(EmployeeGender employeeGender);
    void deleteGender(Employee employee);
    void deleteRace(Employee employee);
    Gender readGender(Employee employee);
    Race readRace(Employee employee);
}

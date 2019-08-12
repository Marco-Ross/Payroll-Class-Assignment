package com.marco.assignment.Services.employee.employeeservice;

import com.marco.assignment.Services.ServiceGI;
import com.marco.assignment.domain.employee.EmployeeRace;

import java.util.Set;

public interface EmployeeRaceService extends ServiceGI<EmployeeRace, Integer> {
    Set<EmployeeRace> getAllEmployeeRaces();
}

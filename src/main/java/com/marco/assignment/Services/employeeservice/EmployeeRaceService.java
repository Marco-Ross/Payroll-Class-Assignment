package com.marco.assignment.Services.employeeservice;

import com.marco.assignment.Services.ServiceGI;
import com.marco.assignment.domain.EmployeeRace;

import java.util.Set;

public interface EmployeeRaceService extends ServiceGI<EmployeeRace, Integer> {
    Set<EmployeeRace> getAllEmployeeRaces();
}

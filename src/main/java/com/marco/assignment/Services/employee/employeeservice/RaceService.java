package com.marco.assignment.Services.employee.employeeservice;

import com.marco.assignment.Services.ServiceGI;
import com.marco.assignment.domain.employee.Race;

import java.util.Set;

public interface RaceService extends ServiceGI<Race, Integer> {
    Set<Race> getAllRaces();
}

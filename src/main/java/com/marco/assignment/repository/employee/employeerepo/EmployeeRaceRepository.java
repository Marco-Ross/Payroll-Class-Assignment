package com.marco.assignment.repository.employee.employeerepo;

import com.marco.assignment.domain.employee.EmployeeRace;
import com.marco.assignment.repository.RepositoryGI;

import java.util.Set;

public interface EmployeeRaceRepository extends RepositoryGI<EmployeeRace, Integer> {
    Set<EmployeeRace> getAllEmployeeRaces();
}

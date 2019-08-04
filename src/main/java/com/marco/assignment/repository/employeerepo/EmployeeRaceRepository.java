package com.marco.assignment.repository.employeerepo;

import com.marco.assignment.domain.EmployeeRace;
import com.marco.assignment.repository.RepositoryGI;

import java.util.Set;

public interface EmployeeRaceRepository extends RepositoryGI<EmployeeRace, Integer> {
    Set<EmployeeRace> getAllEmployeeRaces();
}

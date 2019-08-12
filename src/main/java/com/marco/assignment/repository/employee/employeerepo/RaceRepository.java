package com.marco.assignment.repository.employee.employeerepo;

import com.marco.assignment.domain.employee.Race;
import com.marco.assignment.repository.RepositoryGI;

import java.util.Set;

public interface RaceRepository extends RepositoryGI<Race, Integer> {
    Set<Race> getAllRaces();
}

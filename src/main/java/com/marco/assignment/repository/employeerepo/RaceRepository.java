package com.marco.assignment.repository.employeerepo;

import com.marco.assignment.domain.Race;
import com.marco.assignment.repository.RepositoryGI;

import java.util.Set;

public interface RaceRepository extends RepositoryGI<Race, Integer> {
    Set<Race> getAllRaces();
}

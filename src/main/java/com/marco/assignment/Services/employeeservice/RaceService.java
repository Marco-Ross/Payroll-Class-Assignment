package com.marco.assignment.Services.employeeservice;

import com.marco.assignment.Services.ServiceGI;
import com.marco.assignment.domain.Race;

import java.util.Set;

public interface RaceService extends ServiceGI<Race, Integer> {
    Set<Race> getAllRaces();
}

package com.marco.assignment.repository.impl;

import com.marco.assignment.domain.EmployeeRace;
import com.marco.assignment.repository.employeerepo.EmployeeGenderRepository;
import com.marco.assignment.repository.employeerepo.EmployeeRaceRepository;

import java.util.*;

public class EmployeeRaceRepositoryImpl implements EmployeeRaceRepository {
    private static EmployeeRaceRepositoryImpl repository = null;

    private Map<Integer, EmployeeRace> employeeRaceMap;

    private EmployeeRaceRepositoryImpl(){
        this.employeeRaceMap = new HashMap<>();
    }

    public static EmployeeRaceRepositoryImpl getRepository(){
        if(repository == null) repository = new EmployeeRaceRepositoryImpl();
        return repository;
    }

    @Override
    public Set<EmployeeRace> getAllEmployeeRaces() {
        Collection<EmployeeRace> employeeRaces = this.employeeRaceMap.values();
        Set<EmployeeRace> set = new HashSet<>();
        set.addAll(employeeRaces);
        return set;
    }

    @Override
    public EmployeeRace create(EmployeeRace employeeGender) {
        this.employeeRaceMap.put(employeeGender.getEmployeeID(), employeeGender);
        return this.employeeRaceMap.get(employeeGender.getEmployeeID());
    }

    @Override
    public EmployeeRace update(EmployeeRace employeeGender) {
        this.employeeRaceMap.replace(employeeGender.getEmployeeID(), employeeGender);
        return this.employeeRaceMap.get(employeeGender.getEmployeeID());
    }

    @Override
    public void delete(Integer employeeRaceID) {
        this.employeeRaceMap.remove(employeeRaceID);
    }

    @Override
    public EmployeeRace read(Integer employeeRaceID) {
        return this.employeeRaceMap.get(employeeRaceID);
    }
}

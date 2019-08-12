package com.marco.assignment.repository.employee.impl;

import com.marco.assignment.domain.employee.EmployeeRace;
import com.marco.assignment.repository.employee.employeerepo.EmployeeRaceRepository;

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
    public EmployeeRace create(EmployeeRace employeeRace) {
        this.employeeRaceMap.put(employeeRace.getEmployeeID(), employeeRace);
        return this.employeeRaceMap.get(employeeRace.getEmployeeID());
    }

    @Override
    public EmployeeRace update(EmployeeRace employeeRace) {
        this.employeeRaceMap.replace(employeeRace.getEmployeeID(), employeeRace);
        return this.employeeRaceMap.get(employeeRace.getEmployeeID());
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

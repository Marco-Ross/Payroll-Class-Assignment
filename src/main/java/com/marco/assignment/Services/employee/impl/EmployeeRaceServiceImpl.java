package com.marco.assignment.Services.employee.impl;

import com.marco.assignment.Services.employee.employeeservice.EmployeeRaceService;
import com.marco.assignment.domain.employee.EmployeeRace;
import com.marco.assignment.repository.employee.employeerepo.EmployeeRaceRepository;
import com.marco.assignment.repository.employee.impl.EmployeeRaceRepositoryImpl;

import java.util.Set;

public class EmployeeRaceServiceImpl implements EmployeeRaceService {
    private static EmployeeRaceService service = null;
    private EmployeeRaceRepository repository;

    public static EmployeeRaceService getService(){
        if(service == null) service = new EmployeeRaceServiceImpl();
        return service;
    }

    private EmployeeRaceServiceImpl(){
        this.repository = EmployeeRaceRepositoryImpl.getRepository();
    }

    @Override
    public Set<EmployeeRace> getAllEmployeeRaces() {
        return this.repository.getAllEmployeeRaces();
}

    @Override
    public EmployeeRace create(EmployeeRace employeeRace) {
        return this.repository.create(employeeRace);
    }

    @Override
    public EmployeeRace update(EmployeeRace employeeRace) {
        return this.repository.update(employeeRace);
    }

    @Override
    public void delete(Integer employeeID) {
        this.repository.delete(employeeID);
    }

    @Override
    public EmployeeRace read(Integer employeeID) {
        return this.repository.read(employeeID);
    }
}

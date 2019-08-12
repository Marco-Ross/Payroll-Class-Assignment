package com.marco.assignment.Services.employee.impl;
import com.marco.assignment.Services.employee.employeeservice.EmployeeDetailsService;
import com.marco.assignment.domain.employee.*;
import com.marco.assignment.repository.employee.employeerepo.*;
import com.marco.assignment.repository.employee.impl.*;

import java.util.Map;
import java.util.Set;

public class EmployeeDetailsServiceImpl implements  EmployeeDetailsService{
    private EmployeeRepository employeeRepository;
    private EmployeeRaceRepository employeeRaceRepository;
    private EmployeeGenderRepository employeeGenderRepository;
    private GenderRepository genderRepository;
    private RaceRepository raceRepository;

    private static EmployeeDetailsServiceImpl service = null;

    public static EmployeeDetailsServiceImpl getService(){
        if(service == null) service = new EmployeeDetailsServiceImpl();
        return service;
    }

    private EmployeeDetailsServiceImpl(){
        this.employeeRepository = EmployeeRepositoryImpl.getRepository();
        this.employeeRaceRepository = EmployeeRaceRepositoryImpl.getRepository();
        this.employeeGenderRepository = EmployeeGenderRepositoryImpl.getRepository();
        this.genderRepository = GenderRepositoryImpl.getRepository();
        this.raceRepository = RaceRepositoryImpl.getRepository();
    }

    @Override
    public Employee create(Employee employee, EmployeeRace employeeRace, EmployeeGender employeeGender) {
        Employee employee1 = employeeRepository.create(employee);
        employeeGenderRepository.create(employeeGender);
        employeeRaceRepository.create(employeeRace);

        return employee1;
    }

    @Override
    public Employee update(EmployeeGender employeeGender) {
        return null;
    }

    @Override
    public void deleteGender(Employee employee) {
        employeeGenderRepository.delete(employee.getEmployeeID());
    }

    @Override
    public void deleteRace(Employee employee) {
        employeeRaceRepository.delete(employee.getEmployeeID());
    }

    @Override
    public Gender readGender(Employee employee) {
        EmployeeGender employeeGender = employeeGenderRepository.read(employee.getEmployeeID());
        return genderRepository.read(employeeGender.getGenderID());
    }

    @Override
    public Race readRace(Employee employee) {
        EmployeeRace employeeRace = employeeRaceRepository.read(employee.getEmployeeID());
        return raceRepository.read(employeeRace.getRaceID());
    }
}

package com.marco.assignment.repository.impl;

import com.marco.assignment.domain.EmployeeGender;
import com.marco.assignment.repository.employeerepo.EmployeeGenderRepository;

import java.util.*;

public class EmployeeGenderRepositoryImpl implements EmployeeGenderRepository {
    private static EmployeeGenderRepositoryImpl repository = null;

    private Map<Integer, EmployeeGender> employeeGenderMap;

    private EmployeeGenderRepositoryImpl(){
        this.employeeGenderMap = new HashMap<>();
    }

    public static EmployeeGenderRepositoryImpl getRepository(){
        if(repository == null) repository = new EmployeeGenderRepositoryImpl();
        return repository;
    }

    @Override
    public Set<EmployeeGender> getAllEmployeeGenders() {
        Collection<EmployeeGender> employeeGenders = this.employeeGenderMap.values();
        Set<EmployeeGender> set = new HashSet<>();
        set.addAll(employeeGenders);
        return set;
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        this.employeeGenderMap.put(employeeGender.getEmployeeID(), employeeGender);
        return this.employeeGenderMap.get(employeeGender.getEmployeeID());
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        this.employeeGenderMap.replace(employeeGender.getEmployeeID(), employeeGender);
        return this.employeeGenderMap.get(employeeGender.getEmployeeID());
    }

    @Override
    public void delete(Integer employeeID) {
        this.employeeGenderMap.remove(employeeID);
    }

    @Override
    public EmployeeGender read(Integer employeeID) {
        return this.employeeGenderMap.get(employeeID);
    }
}

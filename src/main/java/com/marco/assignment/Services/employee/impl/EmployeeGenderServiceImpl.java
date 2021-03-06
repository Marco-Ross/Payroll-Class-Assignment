package com.marco.assignment.Services.employee.impl;

import com.marco.assignment.Services.employee.employeeservice.EmployeeGenderService;
import com.marco.assignment.domain.employee.EmployeeGender;
import com.marco.assignment.repository.employee.employeerepo.EmployeeGenderRepository;
import com.marco.assignment.repository.employee.impl.EmployeeGenderRepositoryImpl;
import java.util.Set;

public class EmployeeGenderServiceImpl implements EmployeeGenderService {
    private static EmployeeGenderService service = null;
    private EmployeeGenderRepository repository;

    public static EmployeeGenderService getService(){
        if(service == null) service = new EmployeeGenderServiceImpl();
        return service;
    }

    private EmployeeGenderServiceImpl(){
        this.repository = EmployeeGenderRepositoryImpl.getRepository();
    }

    @Override
    public Set<EmployeeGender> getAllEmployeeGenders() {
        return this.repository.getAllEmployeeGenders();
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        return this.repository.create(employeeGender);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        return this.repository.update(employeeGender);
    }

    @Override
    public void delete(Integer employeeID) {
        this.repository.delete(employeeID);
    }

    @Override
    public EmployeeGender read(Integer employeeID) {
        return this.repository.read(employeeID);
    }
}

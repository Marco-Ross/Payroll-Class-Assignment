package com.marco.assignment.Services.employee.impl;

import com.marco.assignment.Services.employee.employeeservice.GenderService;
import com.marco.assignment.domain.employee.Gender;
import com.marco.assignment.repository.employee.employeerepo.GenderRepository;
import com.marco.assignment.repository.employee.impl.GenderRepositoryImpl;

import java.util.Set;

public class GenderServiceImpl implements GenderService {
    private static GenderService service = null;
    private GenderRepository repository;

    public static GenderService getService(){
        if(service == null) service = new GenderServiceImpl();
        return service;
    }

    private GenderServiceImpl(){
        this.repository = GenderRepositoryImpl.getRepository();
    }

    @Override
    public Set<Gender> getAllGenders() {
        return this.repository.getAllGenders();
    }

    @Override
    public Gender create(Gender gender) {
        return this.repository.create(gender);
    }

    @Override
    public Gender update(Gender gender) {
        return this.repository.update(gender);
    }

    @Override
    public void delete(Integer genderID) {
        this.repository.delete(genderID);
    }

    @Override
    public Gender read(Integer genderID) {
        return this.repository.read(genderID);
    }
}

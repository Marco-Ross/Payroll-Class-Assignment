package com.marco.assignment.Services.employee.impl;

import com.marco.assignment.Services.employee.employeeservice.RaceService;
import com.marco.assignment.domain.employee.Race;
import com.marco.assignment.repository.employee.employeerepo.RaceRepository;
import com.marco.assignment.repository.employee.impl.RaceRepositoryImpl;

import java.util.Set;

public class RaceServiceImpl implements RaceService {
    private static RaceService service = null;
    private RaceRepository repository;

    public static RaceService getService(){
        if(service == null) service = new RaceServiceImpl();
        return service;
    }

    private RaceServiceImpl(){
        this.repository = RaceRepositoryImpl.getRepository();
    }

    @Override
    public Set<Race> getAllRaces() {
        return this.repository.getAllRaces();
    }

    @Override
    public Race create(Race race) {
        return this.repository.create(race);
    }

    @Override
    public Race update(Race race) {
        return this.repository.update(race);
    }

    @Override
    public void delete(Integer raceID) {
        this.repository.delete(raceID);
    }

    @Override
    public Race read(Integer raceID) {
        return this.repository.read(raceID);
    }
}

package com.marco.assignment.repository.employee.impl;

import com.marco.assignment.domain.employee.Race;
import com.marco.assignment.repository.employee.employeerepo.RaceRepository;

import java.util.*;

public class RaceRepositoryImpl implements RaceRepository {
    private static RaceRepositoryImpl repository = null;

    private Map<Integer, Race> raceMap;

    private RaceRepositoryImpl(){
        this.raceMap = new HashMap<>();
    }

    public static RaceRepositoryImpl getRepository(){
        if(repository == null) repository = new RaceRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Race> getAllRaces() {
        Collection<Race> races = this.raceMap.values();
        Set<Race> set = new HashSet<>();
        set.addAll(races);
        return set;
    }

    @Override
    public Race create(Race race) {
        this.raceMap.put(race.getRaceID(), race);
        return this.raceMap.get(race.getRaceID());
    }

    @Override
    public Race update(Race race) {
        this.raceMap.replace(race.getRaceID(), race);
        return this.raceMap.get(race.getRaceID());
    }

    @Override
    public void delete(Integer raceID) {
        this.raceMap.remove(raceID);
    }

    @Override
    public Race read(Integer raceID) {
        return this.raceMap.get(raceID);
    }
}

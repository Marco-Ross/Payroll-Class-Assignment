package com.marco.assignment.repository.employee.impl;

import com.marco.assignment.domain.employee.Gender;
import com.marco.assignment.repository.employee.employeerepo.GenderRepository;

import java.util.*;

public class GenderRepositoryImpl implements GenderRepository {
    private static GenderRepositoryImpl repository = null;

    private Map<Integer, Gender> genderMap;

    private GenderRepositoryImpl(){
        this.genderMap = new HashMap<>();
    }

    public static GenderRepositoryImpl getRepository(){
        if(repository == null) repository = new GenderRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Gender> getAllGenders() {
        Collection<Gender> genders = this.genderMap.values();
        Set<Gender> set = new HashSet<>();
        set.addAll(genders);
        return set;
    }

    @Override
    public Gender create(Gender gender) {
        this.genderMap.put(gender.getGenderID(), gender);
        return this.genderMap.get(gender.getGenderID());
    }

    @Override
    public Gender update(Gender gender) {
        this.genderMap.replace(gender.getGenderID(), gender);
        return this.genderMap.get(gender.getGenderID());
    }

    @Override
    public void delete(Integer genderID) {
        this.genderMap.remove(genderID);
    }

    @Override
    public Gender read(Integer genderID) {
        return this.genderMap.get(genderID);
    }
}

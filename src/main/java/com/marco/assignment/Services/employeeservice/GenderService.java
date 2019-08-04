package com.marco.assignment.Services.employeeservice;

import com.marco.assignment.Services.ServiceGI;
import com.marco.assignment.domain.Gender;

import java.util.Set;

public interface GenderService extends ServiceGI<Gender, Integer> {
    Set<Gender> getAllGenders();
}

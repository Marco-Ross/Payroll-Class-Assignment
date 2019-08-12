package com.marco.assignment.Services.employee.employeeservice;

import com.marco.assignment.Services.ServiceGI;
import com.marco.assignment.domain.employee.Gender;

import java.util.Set;

public interface GenderService extends ServiceGI<Gender, Integer> {
    Set<Gender> getAllGenders();
}

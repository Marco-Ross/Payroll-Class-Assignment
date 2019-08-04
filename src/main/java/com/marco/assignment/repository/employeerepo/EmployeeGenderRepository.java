package com.marco.assignment.repository.employeerepo;

import com.marco.assignment.domain.EmployeeGender;
import com.marco.assignment.repository.RepositoryGI;

import java.util.Set;

public interface EmployeeGenderRepository extends RepositoryGI<EmployeeGender, Integer> {
    Set<EmployeeGender> getAllEmployeeGenders();
}

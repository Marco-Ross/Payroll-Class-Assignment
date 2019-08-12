package com.marco.assignment.repository.employee.employeerepo;

import com.marco.assignment.domain.employee.EmployeeGender;
import com.marco.assignment.repository.RepositoryGI;

import java.util.Set;

public interface EmployeeGenderRepository extends RepositoryGI<EmployeeGender, Integer> {
    Set<EmployeeGender> getAllEmployeeGenders();
}

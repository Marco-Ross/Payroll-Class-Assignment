package com.marco.assignment.repository.employee.employeerepo;

import com.marco.assignment.domain.employee.Gender;
import com.marco.assignment.repository.RepositoryGI;

import java.util.Set;

public interface GenderRepository extends RepositoryGI<Gender, Integer> {
    Set<Gender> getAllGenders();
}

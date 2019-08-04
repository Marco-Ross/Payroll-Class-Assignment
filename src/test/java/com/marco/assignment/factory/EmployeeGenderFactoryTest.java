package com.marco.assignment.factory;

import com.marco.assignment.domain.Employee;
import com.marco.assignment.domain.EmployeeGender;
import com.marco.assignment.domain.Gender;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeGenderFactoryTest {

    @Test
    public void buildEmployeeGender() {
        Employee employee = EmployeeFactory.buildEmployee(1,"Marco", "Ross");

        Gender gender = GenderFactory.buildGender(1, "Male");

        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender(employee.getEmployeeID(), gender.getGenderID());

        assertSame(1, employeeGender.getEmployeeID());
    }
}
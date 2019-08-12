package com.marco.assignment.factory.employee;

import com.marco.assignment.domain.employee.Employee;
import com.marco.assignment.domain.employee.EmployeeGender;
import com.marco.assignment.domain.employee.Gender;
import com.marco.assignment.factory.employee.EmployeeFactory;
import com.marco.assignment.factory.employee.EmployeeGenderFactory;
import com.marco.assignment.factory.employee.GenderFactory;
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
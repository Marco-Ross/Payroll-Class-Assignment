package com.marco.assignment.factory;

import com.marco.assignment.domain.Employee;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    @Test
    public void buildEmployee() {
        int employeeID = 33;
        String employeeName = "Marco", employeeSurname = "Ross";

        Employee employee = EmployeeFactory.buildEmployee(employeeID, employeeName, employeeSurname);

        assertSame(employeeID, employee.getEmployeeID());
    }
}
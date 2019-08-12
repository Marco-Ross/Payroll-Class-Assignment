package com.marco.assignment.factory.employee;

import com.marco.assignment.domain.employee.Employee;
import com.marco.assignment.factory.employee.EmployeeFactory;
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
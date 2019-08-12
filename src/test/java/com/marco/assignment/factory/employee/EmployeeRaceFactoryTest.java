package com.marco.assignment.factory.employee;

import com.marco.assignment.domain.employee.Employee;
import com.marco.assignment.domain.employee.EmployeeRace;
import com.marco.assignment.domain.employee.Race;
import com.marco.assignment.factory.employee.EmployeeFactory;
import com.marco.assignment.factory.employee.EmployeeRaceFactory;
import com.marco.assignment.factory.employee.RaceFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeRaceFactoryTest {

    @Test
    public void buildEmployeeRace() {
        Employee employee = EmployeeFactory.buildEmployee(2,"Marco", "Ross");

        Race race = RaceFactory.buildRace(3, "Blue");

        EmployeeRace employeeRace = EmployeeRaceFactory.buildEmployeeRace(employee.getEmployeeID(), race.getRaceID());

        assertSame(3, employeeRace.getRaceID());
    }
}
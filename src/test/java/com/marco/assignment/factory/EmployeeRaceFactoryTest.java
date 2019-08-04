package com.marco.assignment.factory;

import com.marco.assignment.domain.Employee;
import com.marco.assignment.domain.EmployeeRace;
import com.marco.assignment.domain.Race;
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
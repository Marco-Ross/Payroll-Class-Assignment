package com.marco.assignment.factory.employee;

import com.marco.assignment.domain.employee.EmployeeRace;

public class EmployeeRaceFactory {
    public static EmployeeRace buildEmployeeRace(int employeeID, int raceID){
        return new EmployeeRace.Builder().employeeID(employeeID)
                .raceID(raceID)
                .build();
    }
}

package com.marco.assignment.factory;

import com.marco.assignment.domain.EmployeeRace;

public class EmployeeRaceFactory {
    public static EmployeeRace buildEmployeeRace(int employeeID, int raceID){
        return new EmployeeRace.Builder().employeeID(employeeID)
                .raceID(raceID)
                .build();
    }
}

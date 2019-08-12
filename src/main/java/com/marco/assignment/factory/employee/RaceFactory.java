package com.marco.assignment.factory.employee;

import com.marco.assignment.domain.employee.Race;

public class RaceFactory {
    public static Race buildRace(int raceID, String raceType){
        return new Race.Builder().raceID(raceID)
                .raceType(raceType)
                .build();
    }
}

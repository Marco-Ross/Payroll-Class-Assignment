package com.marco.assignment.factory;

import com.marco.assignment.domain.Race;

public class RaceFactory {
    public static Race buildRace(int raceID, String raceType){
        return new Race.Builder().raceID(raceID)
                .raceType(raceType)
                .build();
    }
}

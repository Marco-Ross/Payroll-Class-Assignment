package com.marco.assignment.factory.employee;

import com.marco.assignment.domain.employee.Race;
import com.marco.assignment.factory.employee.RaceFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    @Test
    public void buildRace() {
        int raceID = 1;
        String raceType = "Orange";

        Race race = RaceFactory.buildRace(raceID, raceType);

        assertSame(raceID, race.getRaceID());
    }
}
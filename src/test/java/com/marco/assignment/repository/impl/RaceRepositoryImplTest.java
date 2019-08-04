package com.marco.assignment.repository.impl;

import com.marco.assignment.domain.Race;
import com.marco.assignment.factory.RaceFactory;
import com.marco.assignment.repository.employeerepo.RaceRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RaceRepositoryImplTest {
    private RaceRepository repository;
    private Race race;

    private Race getRepo(){
        for(Race raceA : repository.getAllRaces()){
            if(raceA.getRaceID() == race.getRaceID()){
                return raceA;
            }
        }
        return null;
    }

    @Before
    public void setUp() throws Exception {
        repository = RaceRepositoryImpl.getRepository();
        //this.repository = AnnouncerRepositoryImpl.getRepository(); //was used to initialize the repository impl. and initialize the dataSet

        race = RaceFactory.buildRace(1, "Purple");
    }

    @Test
    public void d_getAllRaces() {
        Set<Race> setList = repository.getAllRaces();
        Assert.assertEquals(1, setList.size());
    }

    @Test
    public void a_create() {
        Race genderTest = this.repository.create(race);

        Assert.assertEquals(race, genderTest);
    }

    @Test
    public void c_update() {
        Assert.assertNotNull(getRepo());
        String raceChange = "Blue";
        Race updated = new Race.Builder().copy(getRepo()).raceType(raceChange).build();

        this.repository.update(updated);

        Assert.assertEquals(raceChange, updated.getRaceType());
        System.out.println("Race updated");
    }

    @Test
    public void e_delete() {
        repository.delete(race.getRaceID());
        Set<Race> races = repository.getAllRaces();
        Assert.assertEquals(0, races.size());
    }

    @Test
    public void b_read() {
        Race raceList = repository.read(1);
        Assert.assertEquals(race.getRaceID(), raceList.getRaceID());
    }
}
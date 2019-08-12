package com.marco.assignment.Services.employee.impl;

import com.marco.assignment.Services.employee.employeeservice.RaceService;
import com.marco.assignment.Services.employee.impl.RaceServiceImpl;
import com.marco.assignment.domain.employee.Race;
import com.marco.assignment.factory.employee.RaceFactory;
import org.junit.*;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RaceServiceImplTest {
    private RaceService service;
    private Race race;

    private Race getRepo(){
        for(Race raceA : service.getAllRaces()){
            if(raceA.getRaceID() == race.getRaceID()){
                return raceA;
            }
        }
        return null;
    }

    @Before
    public void setUp() throws Exception {
        service = RaceServiceImpl.getService();
        //this.repository = AnnouncerRepositoryImpl.getRepository(); //was used to initialize the repository impl. and initialize the dataSet

        race = RaceFactory.buildRace(1, "Purple");
    }

    @Test
    public void d_getAllRaces() {
        //Set<Race> setList = service.getAllRaces();
        //Assert.assertEquals(1, setList.size());
    }

    @Test
    public void a_create() {
        Race genderTest = this.service.create(race);

        Assert.assertEquals(race, genderTest);
    }

    @Test
    public void c_update() {
        Assert.assertNotNull(getRepo());
        String raceChange = "Blue";
        Race updated = new Race.Builder().copy(getRepo()).raceType(raceChange).build();

        this.service.update(updated);

        Assert.assertEquals(raceChange, updated.getRaceType());
        System.out.println("Race updated");
    }

    @Test
    public void e_delete() {
        //service.delete(race.getRaceID());
        //Set<Race> races = service.getAllRaces();
        //Assert.assertEquals(0, races.size());
    }

    @Test
    public void b_read() {
        Race raceList = service.read(1);
        Assert.assertEquals(race.getRaceID(), raceList.getRaceID());
    }
}
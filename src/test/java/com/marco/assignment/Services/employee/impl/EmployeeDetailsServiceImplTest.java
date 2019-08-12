package com.marco.assignment.Services.employee.impl;

import com.marco.assignment.Services.employee.employeeservice.*;
import com.marco.assignment.domain.employee.*;
import com.marco.assignment.factory.employee.*;
import com.marco.assignment.repository.employee.employeerepo.*;
import com.marco.assignment.repository.employee.impl.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeDetailsServiceImplTest {
    private EmployeeDetailsServiceImpl employeeDetailsService;
    private Employee employee;
    private EmployeeGender employeeGender;
    private EmployeeRace employeeRace;

    /*private EmployeeGender getRepo(){
        for(EmployeeGender employeeGenderA : employeeGenderRepository.getAllEmployeeGenders()){
            if(employeeGenderA.getEmployeeID() == employee.getEmployeeID()){
                return employeeGenderA;
            }
        }
        return null;
    }*/

    @Before
    public void setUp() throws Exception {
        employeeDetailsService = EmployeeDetailsServiceImpl.getService();

        RaceRepository raceRepository = RaceRepositoryImpl.getRepository();
        GenderRepository genderRepository = GenderRepositoryImpl.getRepository();

        Race race1 = RaceFactory.buildRace(2, "Orange");
        Gender gender1 = GenderFactory.buildGender(1, "Yale");
        raceRepository.create(race1);
        genderRepository.create(gender1);

        employee = EmployeeFactory.buildEmployee(1, "Marco", "Ross");
        employeeGender = EmployeeGenderFactory.buildEmployeeGender(employee.getEmployeeID(), 1);
        employeeRace = EmployeeRaceFactory.buildEmployeeRace(employee.getEmployeeID(), 2);
    }
    @Test
    public void a_creation() {
        Employee employee1 = employeeDetailsService.create(employee, employeeRace, employeeGender);
        assertEquals(employee.getEmployeeID(),employee1.getEmployeeID());
    }

    @Test
    public void d_update() {
        /*Assert.assertNotNull(getRepo());
        int employeeGenderChange = 2;

        EmployeeGender updated = new EmployeeGender.Builder().copy(getRepo()).genderID(employeeGenderChange).build();
        this.employeeDetailsService.update(updated);

        Assert.assertEquals(employeeGenderChange, updated.getGenderID());
        System.out.println("EmployeeGender updated");*/
    }

    @Test
    public void f_deleteGender() {
        employeeDetailsService.deleteGender(employee);
        Set<EmployeeGender> employeeGenders = EmployeeGenderServiceImpl.getService().getAllEmployeeGenders();
        Assert.assertEquals(0, employeeGenders.size());
    }

    @Test
    public void e_deleteRace() {
        employeeDetailsService.deleteRace(employee);
        Set<EmployeeRace> employeeRaces = EmployeeRaceServiceImpl.getService().getAllEmployeeRaces();

        Assert.assertEquals(0, employeeRaces.size());
    }

    @Test
    public void b_readGender() {
        Gender gender = employeeDetailsService.readGender(employee);
        Assert.assertEquals(employeeGender.getGenderID(), gender.getGenderID());

        System.out.println(gender.getGenderType());
    }

    @Test
    public void c_readRace() {
        Race race = employeeDetailsService.readRace(employee);
        Assert.assertEquals(employeeRace.getRaceID(), race.getRaceID());

        System.out.println(race.getRaceType());
    }
}
package com.marco.assignment.Services.employee.impl;

import com.marco.assignment.Services.employee.employeeservice.EmployeeRaceService;
import com.marco.assignment.Services.employee.impl.EmployeeRaceServiceImpl;
import com.marco.assignment.domain.employee.EmployeeRace;
import com.marco.assignment.factory.employee.EmployeeRaceFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeRaceServiceImplTest {
    private EmployeeRaceService service;
    private EmployeeRace employeeRace;

    private EmployeeRace getRepo(){
        for(EmployeeRace employeeRaceA : service.getAllEmployeeRaces()){
            if(employeeRaceA.getEmployeeID() == employeeRace.getEmployeeID()){
                return employeeRaceA;
            }
        }
        return null;
    }

    @Before
    public void setUp() throws Exception {
        service = EmployeeRaceServiceImpl.getService();
        //this.repository = AnnouncerRepositoryImpl.getRepository(); //was used to initialize the repository impl. and initialize the dataSet

        employeeRace = EmployeeRaceFactory.buildEmployeeRace(1, 1);
    }

    @Test
    public void d_getAllEmployeeRaces() {
        Set<EmployeeRace> setList = service.getAllEmployeeRaces();
        Assert.assertEquals(1, setList.size());
    }

    @Test
    public void a_create() {
        EmployeeRace employeeRaceTest = this.service.create(employeeRace);

        Assert.assertEquals(employeeRace, employeeRaceTest);
    }

    @Test
    public void c_update() {
        Assert.assertNotNull(getRepo());
        int employeeRaceBlue = 2;
        EmployeeRace updated = new EmployeeRace.Builder().copy(getRepo()).raceID(employeeRaceBlue).build();

        this.service.update(updated);

        Assert.assertEquals(employeeRaceBlue, updated.getRaceID());
        System.out.println("EmployeeRace updated");
    }

    @Test
    public void e_delete() {
        service.delete(employeeRace.getEmployeeID());
        Set<EmployeeRace> employeeRaces = service.getAllEmployeeRaces();
        Assert.assertEquals(0, employeeRaces.size());
    }

    @Test
    public void b_read() {
        EmployeeRace employeeRaceList = service.read(1);
        Assert.assertEquals(employeeRace.getEmployeeID(), employeeRaceList.getEmployeeID());
    }
}
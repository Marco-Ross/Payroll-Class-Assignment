package com.marco.assignment.repository.employee.impl;

import com.marco.assignment.domain.employee.EmployeeRace;
import com.marco.assignment.factory.employee.EmployeeRaceFactory;
import com.marco.assignment.repository.employee.employeerepo.EmployeeRaceRepository;
import com.marco.assignment.repository.employee.impl.EmployeeRaceRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeRaceRepositoryImplTest {
    private EmployeeRaceRepository repository;
    private EmployeeRace employeeRace;

    private EmployeeRace getRepo(){
        for(EmployeeRace employeeRaceA : repository.getAllEmployeeRaces()){
            if(employeeRaceA.getEmployeeID() == employeeRace.getEmployeeID()){
                return employeeRaceA;
            }
        }
        return null;
    }

    @Before
    public void setUp() throws Exception {
        repository = EmployeeRaceRepositoryImpl.getRepository();
        //this.repository = AnnouncerRepositoryImpl.getRepository(); //was used to initialize the repository impl. and initialize the dataSet

        employeeRace = EmployeeRaceFactory.buildEmployeeRace(1, 1);
    }

    @Test
    public void d_getAllEmployeeRaces() {
        Set<EmployeeRace> setList = repository.getAllEmployeeRaces();
        Assert.assertEquals(1, setList.size());
    }

    @Test
    public void a_create() {
        EmployeeRace employeeRaceTest = this.repository.create(employeeRace);

        Assert.assertEquals(employeeRace, employeeRaceTest);
    }

    @Test
    public void c_update() {
        Assert.assertNotNull(getRepo());
        int employeeRaceBlue = 2;
        EmployeeRace updated = new EmployeeRace.Builder().copy(getRepo()).raceID(employeeRaceBlue).build();

        this.repository.update(updated);

        Assert.assertEquals(employeeRaceBlue, updated.getRaceID());
        System.out.println("EmployeeRace updated");
    }

    @Test
    public void e_delete() {
        repository.delete(employeeRace.getEmployeeID());
        Set<EmployeeRace> employeeGenders = repository.getAllEmployeeRaces();
        Assert.assertEquals(0, employeeGenders.size());
    }

    @Test
    public void b_read() {
        EmployeeRace employeeRaceList = repository.read(1);
        Assert.assertEquals(employeeRace.getEmployeeID(), employeeRaceList.getEmployeeID());
    }
}
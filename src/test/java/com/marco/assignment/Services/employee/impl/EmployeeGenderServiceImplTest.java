package com.marco.assignment.Services.employee.impl;

import com.marco.assignment.Services.employee.employeeservice.EmployeeGenderService;
import com.marco.assignment.Services.employee.impl.EmployeeGenderServiceImpl;
import com.marco.assignment.domain.employee.EmployeeGender;
import com.marco.assignment.factory.employee.EmployeeGenderFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeGenderServiceImplTest {

    private EmployeeGenderService service;
    private EmployeeGender employeeGender;

    private EmployeeGender getRepo(){
        for(EmployeeGender employeeGenderA : service.getAllEmployeeGenders()){
            if(employeeGenderA.getEmployeeID() == employeeGender.getEmployeeID()){
                return employeeGenderA;
            }
        }
        return null;
    }

    @Before
    public void setUp() throws Exception {
        service = EmployeeGenderServiceImpl.getService();
        //this.repository = AnnouncerRepositoryImpl.getRepository(); //was used to initialize the repository impl. and initialize the dataSet
        employeeGender = EmployeeGenderFactory.buildEmployeeGender(1, 1);
    }

    @Test
    public void d_getAllEmployeeGenders() {
        Set<EmployeeGender> setList = service.getAllEmployeeGenders();
        Assert.assertEquals(1, setList.size());
    }

    @Test
    public void a_create() {
        EmployeeGender employeeGenderTest = this.service.create(employeeGender);

        Assert.assertEquals(employeeGender, employeeGenderTest);
    }

    @Test
    public void c_update() {
        Assert.assertNotNull(getRepo());
        int employeeGenderFemale = 2;
        EmployeeGender updated = new EmployeeGender.Builder().copy(getRepo()).genderID(employeeGenderFemale).build();

        this.service.update(updated);

        Assert.assertEquals(employeeGenderFemale, updated.getGenderID());
        System.out.println("EmployeeGender updated");
    }

    @Test
    public void e_delete() {
        service.delete(employeeGender.getEmployeeID());
        Set<EmployeeGender> employeeGenders = service.getAllEmployeeGenders();
        Assert.assertEquals(0, employeeGenders.size());
    }

    @Test
    public void b_read() {
        EmployeeGender employeeGenderList = service.read(1);
        Assert.assertEquals(employeeGender.getEmployeeID(), employeeGenderList.getEmployeeID());
    }
}
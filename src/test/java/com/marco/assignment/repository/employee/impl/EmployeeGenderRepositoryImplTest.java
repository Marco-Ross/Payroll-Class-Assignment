package com.marco.assignment.repository.employee.impl;

import com.marco.assignment.domain.employee.EmployeeGender;
import com.marco.assignment.factory.employee.EmployeeGenderFactory;
import com.marco.assignment.repository.employee.employeerepo.EmployeeGenderRepository;
import com.marco.assignment.repository.employee.impl.EmployeeGenderRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeGenderRepositoryImplTest {

    private EmployeeGenderRepository repository;
    private EmployeeGender employeeGender;

    private EmployeeGender getRepo(){
        for(EmployeeGender employeeGenderA : repository.getAllEmployeeGenders()){
            if(employeeGenderA.getEmployeeID() == employeeGender.getEmployeeID()){
                return employeeGenderA;
            }
        }
        return null;
    }

    @Before
    public void setUp() throws Exception {
        repository = EmployeeGenderRepositoryImpl.getRepository();
        //this.repository = AnnouncerRepositoryImpl.getRepository(); //was used to initialize the repository impl. and initialize the dataSet
        employeeGender = EmployeeGenderFactory.buildEmployeeGender(1, 1);
    }

    @Test
    public void d_getAllEmployeeGenders() {
        Set<EmployeeGender> setList = repository.getAllEmployeeGenders();
        Assert.assertEquals(1, setList.size());
    }

    @Test
    public void a_create() {
        EmployeeGender employeeGenderTest = this.repository.create(employeeGender);

        Assert.assertEquals(employeeGender, employeeGenderTest);
    }

    @Test
    public void c_update() {
        Assert.assertNotNull(getRepo());
        int employeeGenderFemale = 2;
        EmployeeGender updated = new EmployeeGender.Builder().copy(getRepo()).genderID(employeeGenderFemale).build();

        this.repository.update(updated);

        Assert.assertEquals(employeeGenderFemale, updated.getGenderID());
        System.out.println("EmployeeGender updated");
    }

    @Test
    public void e_delete() {
        repository.delete(employeeGender.getEmployeeID());
        Set<EmployeeGender> employeeGenders = repository.getAllEmployeeGenders();
        Assert.assertEquals(0, employeeGenders.size());
    }

    @Test
    public void b_read() {
        EmployeeGender employeeGenderList = repository.read(1);
        Assert.assertEquals(employeeGender.getEmployeeID(), employeeGenderList.getEmployeeID());
    }
}
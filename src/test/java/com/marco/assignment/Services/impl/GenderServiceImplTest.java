package com.marco.assignment.Services.impl;

import com.marco.assignment.Services.employeeservice.GenderService;
import com.marco.assignment.domain.Gender;
import com.marco.assignment.factory.GenderFactory;
import com.marco.assignment.repository.employeerepo.GenderRepository;
import com.marco.assignment.repository.impl.GenderRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GenderServiceImplTest {
    private GenderService service;
    private Gender gender;

    private Gender getRepo(){
        for(Gender genderA : service.getAllGenders()){
            if(genderA.getGenderID() == gender.getGenderID()){
                return genderA;
            }
        }
        return null;
    }

    @Before
    public void setUp() throws Exception {
        service = GenderServiceImpl.getService();
        //this.repository = AnnouncerRepositoryImpl.getRepository(); //was used to initialize the repository impl. and initialize the dataSet

        gender = GenderFactory.buildGender(1, "Male");
    }

    @Test
    public void d_getAllGenders() {
        Set<Gender> setList = service.getAllGenders();
        Assert.assertEquals(1, setList.size());
    }

    @Test
    public void a_create() {
        Gender genderTest = this.service.create(gender);

        Assert.assertEquals(gender, genderTest);
    }

    @Test
    public void c_update() {
        Assert.assertNotNull(getRepo());
        String genderChange = "Non-Binary";
        Gender updated = new Gender.Builder().copy(getRepo()).genderType(genderChange).build();

        this.service.update(updated);

        Assert.assertEquals(genderChange, updated.getGenderType());
        System.out.println("Gender updated");
    }

    @Test
    public void e_delete() {
        service.delete(gender.getGenderID());
        Set<Gender> genders = service.getAllGenders();
        Assert.assertEquals(0, genders.size());
    }

    @Test
    public void b_read() {
        Gender genderList = service.read(1);
        Assert.assertEquals(gender.getGenderID(), genderList.getGenderID());
    }
}
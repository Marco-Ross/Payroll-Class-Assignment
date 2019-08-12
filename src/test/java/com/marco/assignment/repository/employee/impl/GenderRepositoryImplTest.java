package com.marco.assignment.repository.employee.impl;

import com.marco.assignment.domain.employee.Gender;
import com.marco.assignment.factory.employee.GenderFactory;
import com.marco.assignment.repository.employee.employeerepo.GenderRepository;
import com.marco.assignment.repository.employee.impl.GenderRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GenderRepositoryImplTest {
    private GenderRepository repository;
    private Gender gender;

    private Gender getRepo(){
        for(Gender genderA : repository.getAllGenders()){
            if(genderA.getGenderID() == gender.getGenderID()){
                return genderA;
            }
        }
        return null;
    }

    @Before
    public void setUp() throws Exception {
        repository = GenderRepositoryImpl.getRepository();
        //this.repository = AnnouncerRepositoryImpl.getRepository(); //was used to initialize the repository impl. and initialize the dataSet

        gender = GenderFactory.buildGender(1, "Male");
    }

    @Test
    public void d_getAllGenders() {
        Set<Gender> setList = repository.getAllGenders();
        Assert.assertEquals(1, setList.size());
    }

    @Test
    public void a_create() {
        Gender genderTest = this.repository.create(gender);

        Assert.assertEquals(gender, genderTest);
    }

    @Test
    public void c_update() {
        Assert.assertNotNull(getRepo());
        String genderChange = "Non-Binary";
        Gender updated = new Gender.Builder().copy(getRepo()).genderType(genderChange).build();

        this.repository.update(updated);

        Assert.assertEquals(genderChange, updated.getGenderType());
        System.out.println("Gender updated");
    }

    @Test
    public void e_delete() {
        repository.delete(gender.getGenderID());
        Set<Gender> genders = repository.getAllGenders();
        Assert.assertEquals(0, genders.size());
    }

    @Test
    public void b_read() {
        Gender genderList = repository.read(1);
        Assert.assertEquals(gender.getGenderID(), genderList.getGenderID());
    }
}
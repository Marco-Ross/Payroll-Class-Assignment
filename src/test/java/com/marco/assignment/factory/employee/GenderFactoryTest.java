package com.marco.assignment.factory.employee;

import com.marco.assignment.domain.employee.Gender;
import com.marco.assignment.factory.employee.GenderFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderFactoryTest {

    @Test
    public void buildGender() {
        int genderID = 1;
        String genderType = "Male";

        Gender gender = GenderFactory.buildGender(genderID, genderType);

        assertSame(genderID, gender.getGenderID());
    }
}
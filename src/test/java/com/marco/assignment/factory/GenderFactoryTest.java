package com.marco.assignment.factory;

import com.marco.assignment.domain.Gender;
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
package com.marco.assignment.factory.employee;

import com.marco.assignment.domain.employee.Gender;

public class GenderFactory {
    public static Gender buildGender(int genderID, String genderType){
        return new Gender.Builder().genderID(genderID)
                .genderType(genderType)
                .build();
    }
}

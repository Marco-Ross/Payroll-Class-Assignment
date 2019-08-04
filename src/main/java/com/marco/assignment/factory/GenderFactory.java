package com.marco.assignment.factory;

import com.marco.assignment.domain.Gender;

public class GenderFactory {
    public static Gender buildGender(int genderID, String genderType){
        return new Gender.Builder().genderID(genderID)
                .genderType(genderType)
                .build();
    }
}

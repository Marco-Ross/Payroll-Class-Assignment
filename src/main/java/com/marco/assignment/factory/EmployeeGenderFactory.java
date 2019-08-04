package com.marco.assignment.factory;

import com.marco.assignment.domain.EmployeeGender;

public class EmployeeGenderFactory {
    public static EmployeeGender buildEmployeeGender(int employeeID, int genderID){
        return new EmployeeGender.Builder().employeeID(employeeID)
                .genderID(genderID)
                .build();
    }
}

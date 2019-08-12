package com.marco.assignment.factory.employee;

import com.marco.assignment.domain.employee.EmployeeGender;

public class EmployeeGenderFactory {
    public static EmployeeGender buildEmployeeGender(int employeeID, int genderID){
        return new EmployeeGender.Builder().employeeID(employeeID)
                .genderID(genderID)
                .build();
    }
}

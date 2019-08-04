package com.marco.assignment.factory;

import com.marco.assignment.domain.Employee;

public class EmployeeFactory {
    public static Employee buildEmployee(int employeeID, String employeeFirstName, String employeeLastName){
        return new Employee.Builder().employeeID(employeeID)
                .employeeFirstName(employeeFirstName)
                .employeeLastName(employeeLastName)
                .build();
    }
}

package com.marco.assignment.factory.employee;

import com.marco.assignment.domain.employee.Employee;

public class EmployeeFactory {
    public static Employee buildEmployee(int employeeID, String employeeFirstName, String employeeLastName){
        return new Employee.Builder().employeeID(employeeID)
                .employeeFirstName(employeeFirstName)
                .employeeLastName(employeeLastName)
                .build();
    }
}

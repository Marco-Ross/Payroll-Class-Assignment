package com.marco.assignment.domain.employee;

public class Employee {
    private int employeeID;
    private String employeeFirstName;
    private String employeeLastName;

    private Employee(){}

    private Employee(Builder builder){
        this.employeeID = builder.employeeID;
        this.employeeFirstName = builder.employeeFirstName;
        this.employeeLastName = builder.employeeLastName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public static class Builder{
        private int employeeID;
        private String employeeFirstName;
        private String employeeLastName;

        public Builder employeeID(int employeeID){
            this.employeeID = employeeID;
            return this;
        }
        public Builder employeeFirstName(String employeeFirstName){
            this.employeeFirstName = employeeFirstName;
            return this;
        }
        public Builder employeeLastName(String employeeLastName){
            this.employeeLastName = employeeLastName;
            return this;
        }

        public Builder copy(Employee employee){
            this.employeeID = employee.employeeID;
            this.employeeFirstName = employee.employeeFirstName;
            this.employeeLastName = employee.employeeLastName;

            return this;
        }

        public Employee build() {return new Employee(this);}
    }
}

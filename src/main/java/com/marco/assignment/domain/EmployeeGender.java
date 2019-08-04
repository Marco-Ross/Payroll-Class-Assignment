package com.marco.assignment.domain;

public class EmployeeGender {
    private int employeeID;
    private int genderID;

    private EmployeeGender(){}

    private EmployeeGender(Builder builder){
        this.employeeID = builder.employeeID;
        this.genderID = builder.genderID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public int getGenderID() {
        return genderID;
    }

    public static class Builder{
        private int employeeID;
        private int genderID;

        public Builder employeeID(int employeeID){
            this.employeeID = employeeID;
            return this;
        }
        public Builder genderID(int genderID){
            this.genderID = genderID;
            return this;
        }

        public Builder copy(EmployeeGender employeeGender){
            this.employeeID = employeeGender.employeeID;
            this.genderID = employeeGender.genderID;

            return this;
        }

        public EmployeeGender build() {return new EmployeeGender(this);}
    }

}

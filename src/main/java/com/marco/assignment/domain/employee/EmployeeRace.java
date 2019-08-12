package com.marco.assignment.domain.employee;

public class EmployeeRace {
    private int employeeID;
    private int raceID;

    private EmployeeRace(Builder builder){
        this.employeeID = builder.employeeID;
        this.raceID = builder.raceID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public int getRaceID() {
        return raceID;
    }

    public static class Builder{
        private int employeeID;
        private int raceID;


        public Builder employeeID(int employeeID){
            this.employeeID = employeeID;
            return this;
        }
        public Builder raceID(int raceID){
            this.raceID = raceID;
            return this;
        }

        public Builder copy(EmployeeRace employeeRace){
            this.employeeID = employeeRace.employeeID;
            this.raceID = employeeRace.raceID;

            return this;
        }

        public EmployeeRace build() {return new EmployeeRace(this);}
    }
}

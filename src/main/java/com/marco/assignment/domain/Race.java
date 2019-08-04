package com.marco.assignment.domain;

public class Race {
    private int raceID;
    private String raceType;

    private Race(){}

    private Race(Builder builder){
        this.raceID = builder.raceID;
        this.raceType = builder.raceType;
    }

    public int getRaceID() {
        return raceID;
    }

    public String getRaceType() {
        return raceType;
    }

    public static class Builder{
        private int raceID;
        private String raceType;

        public Builder raceID(int raceID){
            this.raceID = raceID;
            return this;
        }
        public Builder raceType(String raceType){
            this.raceType = raceType;
            return this;
        }

        public Builder copy(Race Race){
            this.raceID = Race.raceID;
            this.raceType = Race.raceType;

            return this;
        }

        public Race build() {return new Race(this);}
    }
}

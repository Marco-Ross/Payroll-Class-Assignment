package com.marco.assignment.domain;

public class Gender {
    private int genderID;
    private String genderType;

    private Gender(){}

    private Gender(Builder builder){
        this.genderID = builder.genderID;
        this.genderType = builder.genderType;
    }

    public int getGenderID() {
        return genderID;
    }

    public String getGenderType() {
        return genderType;
    }

    public static class Builder{
        private int genderID;
        private String genderType;

        public Builder genderID(int genderID){
            this.genderID = genderID;
            return this;
        }
        public Builder genderType(String genderType){
            this.genderType = genderType;
            return this;
        }

        public Builder copy(Gender gender){
            this.genderID = gender.genderID;
            this.genderType = gender.genderType;

            return this;
        }

        public Gender build() {return new Gender(this);}
    }
}

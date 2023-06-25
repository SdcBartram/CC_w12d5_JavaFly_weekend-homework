package com.bartram.People;

public enum Rank {
    CAPTAIN("Captain"),
    FIRST_OFFICER("First Officer"),
    LEAD_ATTENDANT("Lead Attendant"),
    FLIGHT_ATTENDANT("Flight Attendant");

    private final String employeeRank;

    Rank(String employeeRank){
        this.employeeRank = employeeRank;
    }

    public String getEmployeeRank(){
        return employeeRank;
    }
}

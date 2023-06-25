package com.bartram.People;

public class Pilot extends CrewMember{

    private int pilotLicenceNumber;

    public Pilot(String name, Rank rank, int pilotLicenceNumber) {
        super(name, rank);
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public int getPilotLicenceNumber(){
        return this.pilotLicenceNumber;
    }

    public void setPilotLicenceNumber(int pilotLicenceNumber) {
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public String flyPlane(){
        return "UP, UP and AWAY!";
    }
}

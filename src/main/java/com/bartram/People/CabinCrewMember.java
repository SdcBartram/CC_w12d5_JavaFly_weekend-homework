package com.bartram.People;

public class CabinCrewMember extends CrewMember{

    public CabinCrewMember(String name, Rank rank) {
        super(name, rank);
    }

    public String messageToPassengers(){
        return "Thank you for flying JavaAir!";
    }
}

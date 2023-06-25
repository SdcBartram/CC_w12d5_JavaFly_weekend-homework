package com.bartram.Flight;

import com.bartram.People.CabinCrewMember;
import com.bartram.People.Passenger;
import com.bartram.People.Pilot;

import java.util.ArrayList;

public class Flight {
    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private int totalWeightAllowance;
    private static final int totalSeats = 350;

    public Flight(Pilot pilot, ArrayList<CabinCrewMember> cabinCrewMembers, String flightNumber,String destination,
                  String departureAirport, String departureTime, int totalWeightAllowance) {
        this.pilot = pilot;
        this.cabinCrewMembers = cabinCrewMembers;
        this.passengers = new ArrayList<>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.totalWeightAllowance = totalWeightAllowance;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public void setCabinCrewMembers(ArrayList<CabinCrewMember> cabinCrewMembers) {
        this.cabinCrewMembers = cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getTotalWeightAllowance() {
        return totalWeightAllowance;
    }

    public void setTotalWeightAllowance(int totalWeightAllowance) {
        this.totalWeightAllowance = totalWeightAllowance;
    }

    public static int getTotalSeats(){
        return totalSeats;
    }

    public int getAvailableSeats(){
        int totalOccupiedSeats = passengers.size();
        return totalSeats - totalOccupiedSeats;
    }
    public void bookPassenger(Passenger passenger){
        if (getAvailableSeats() > 0){
            passengers.add(passenger);
            System.out.println("Passenger " + passenger.getName() + "has been booked successfully!");
        }
        else {
            System.out.println("No available seats, booking not successful!");
        }
    }

}

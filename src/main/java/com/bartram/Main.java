package com.bartram;

import com.bartram.People.Passenger;

public class Main {
    public static void main(String[] args) {

// Instance of the child class
        Passenger passenger = new Passenger("Bobbi Boe", 2);

// Example of the instance using an inherited property
        String passengerName = passenger.getName();
        System.out.println("Passenger name " + passengerName);
    }
}
import com.bartram.Flight.Flight;
import com.bartram.People.CabinCrewMember;
import com.bartram.People.Passenger;
import com.bartram.People.Pilot;
import com.bartram.People.Rank;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlightTest {
    private Flight flight;
    private Pilot pilot;
    private CabinCrewMember crewMember1;
    private CabinCrewMember crewMember2;
    private Passenger passenger1;
    private Passenger passenger2;

    @Before
    public void setup() {
        pilot = new Pilot("Johnny John", Rank.CAPTAIN, 12345);
        crewMember1 = new CabinCrewMember("Emma Ems", Rank.LEAD_ATTENDANT);
        crewMember2 = new CabinCrewMember("Alisha Shisha", Rank.FLIGHT_ATTENDANT);
        passenger1 = new Passenger("Joey Jo", 4);
        passenger2 = new Passenger("Katie Kate", 2);

        ArrayList<CabinCrewMember> cabinCrewMembers = new ArrayList<>();
        cabinCrewMembers.add(crewMember1);
        cabinCrewMembers.add(crewMember2);

        flight = new Flight(pilot, cabinCrewMembers, "BA756", "GLA", "EDI", "12:00 PM", 1000);
    }

    @Test
    public void canGetPilot() {
        assertEquals(pilot, flight.getPilot());
    }

    @Test
    public void canSetPilot() {
        Pilot newPilot = new Pilot("Jane Smith", Rank.CAPTAIN, 98765);
        flight.setPilot(newPilot);
        assertEquals(newPilot, flight.getPilot());
    }

    @Test
    public void canGetCabinCrewMembers() {
        assertEquals(2, flight.getCabinCrewMembers().size());
        assertTrue(flight.getCabinCrewMembers().contains(crewMember1));
        assertTrue(flight.getCabinCrewMembers().contains(crewMember2));
    }

    @Test
    public void canSetCabinCrewMembers() {
        ArrayList<CabinCrewMember> newCabinCrewMembers = new ArrayList<>();
        CabinCrewMember crewMember3 = new CabinCrewMember("Bob Bms", Rank.FLIGHT_ATTENDANT);
        newCabinCrewMembers.add(crewMember3);
        flight.setCabinCrewMembers(newCabinCrewMembers);
        assertEquals(1, flight.getCabinCrewMembers().size());
        assertTrue(flight.getCabinCrewMembers().contains(crewMember3));
    }

    @Test
    public void canGetPassengers() {
        assertEquals(0, flight.getPassengers().size());
    }

    @Test
    public void canSetPassengers() {
        ArrayList<Passenger> newPassengers = new ArrayList<>();
        Passenger newPassenger = new Passenger("Mark Mks", 3);
        newPassengers.add(newPassenger);
        flight.setPassengers(newPassengers);
        assertEquals(1, flight.getPassengers().size());
        assertTrue(flight.getPassengers().contains(newPassenger));
    }

    @Test
    public void canGetFlightNumber() {
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void canSetFlightNumber() {
        String newFlightNumber = "AB123";
        flight.setFlightNumber(newFlightNumber);
        assertEquals(newFlightNumber, flight.getFlightNumber());
    }

    @Test
    public void canGetDestination() {
        assertEquals("GLA", flight.getDestination());
    }

    @Test
    public void canSetDestination() {
        String newDestination = "EDI";
        flight.setDestination(newDestination);
        assertEquals(newDestination, flight.getDestination());
    }

    @Test
    public void canGetDepartureAirport() {
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void canSetDepartureAirport() {
        String newDepartureAirport = "GLA";
        flight.setDepartureAirport(newDepartureAirport);
        assertEquals(newDepartureAirport, flight.getDepartureAirport());
    }

    @Test
    public void canGetDepartureTime() {
        assertEquals("12:00 PM", flight.getDepartureTime());
    }

    @Test
    public void canSetDepartureTime() {
        String newDepartureTime = "1:30 PM";
        flight.setDepartureTime(newDepartureTime);
        assertEquals(newDepartureTime, flight.getDepartureTime());
    }

    @Test
    public void canGetTotalWeightAllowance() {
        assertEquals(1000, flight.getTotalWeightAllowance());
    }

    @Test
    public void canSetTotalWeightAllowance() {
        int newTotalWeightAllowance = 1500;
        flight.setTotalWeightAllowance(newTotalWeightAllowance);
        assertEquals(newTotalWeightAllowance, flight.getTotalWeightAllowance());
    }

    @Test
    public void canGetAvailableSeats() {
        assertEquals(350, flight.getAvailableSeats());
    }

    @Test
    public void canBookPassenger() {
        flight.bookPassenger(passenger1);
        assertEquals(349, flight.getAvailableSeats());
        assertTrue(flight.getPassengers().contains(passenger1));
    }

    @Test
    public void cannotBookPassenger_NoAvailableSeats() {
        for (int i = 0; i < Flight.getTotalSeats(); i++) {
            flight.bookPassenger(new Passenger("Passenger " + (i + 1), 1));
        }
        flight.bookPassenger(passenger2);
        assertEquals(0, flight.getAvailableSeats());
        assertTrue(!flight.getPassengers().contains(passenger2));
    }
}
